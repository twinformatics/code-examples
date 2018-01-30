package at.twinformatics.metricsdemo.aop;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class PageCounterAspect {

    private final MeterRegistry registry;
    private final Counter myCounter;

    public PageCounterAspect(MeterRegistry registry) {
        this.registry = registry;
        myCounter = Counter.builder("sample.aop.counter").register(registry);
    }

    @Before("@annotation(at.twinformatics.metricsdemo.aop.Counted)")
    public void pageCounterMetrics(JoinPoint joinPoint) {
        log.info("called method: " + joinPoint.getSignature());
        myCounter.increment();
    }

}
