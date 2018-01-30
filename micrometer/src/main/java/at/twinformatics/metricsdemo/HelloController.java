package at.twinformatics.metricsdemo;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.DistributionSummary;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.util.Random;

@RestController
public class HelloController {

    private final Random r = new Random();
    
    private final Timer timer;
    private final Counter counter;
    private final DistributionSummary distributionSummary;

    private final HelloService helloService;

    public HelloController(MeterRegistry registry, HelloService helloService) {
        this.helloService = helloService;

        counter = Counter.builder("sample.counter")
                .description("counts something")
                .register(registry);

        timer = Timer.builder("sample.timer")
                .publishPercentileHistogram()
                .maximumExpectedValue(Duration.ofSeconds(5))
                .register(registry);

        Gauge.builder("sampe.gauge", "some input", x -> r.nextDouble())
                .register(registry);

        distributionSummary = DistributionSummary.builder("sample.distSummary")
                .minimumExpectedValue(1L)
                .maximumExpectedValue(1000L)
                .publishPercentileHistogram()
                .register(registry);
    }

    @GetMapping
    @ResponseBody
    public String hello() {

        helloService.thisShouldBeCounted(r.nextInt(10));

        counter.increment();

        distributionSummary.record((double) r.nextInt(1000));

        return timer.record(() -> {
            try {
                Thread.sleep(r.nextInt(500));
                return "Hello Micrometer";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }


}
