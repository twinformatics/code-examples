package at.twinformatics.metricsdemo;

import io.micrometer.core.instrument.Meter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.config.MeterFilter;
import io.micrometer.core.instrument.histogram.HistogramConfig;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Create a histogram for Spring MVC http requests
 *
 * see http://micrometer.io/docs/concepts
 */
@Configuration
public class MetricsConfig {

    private MeterRegistry registry;

    public MetricsConfig(MeterRegistry registry) {
        this.registry = registry;
    }

    @PostConstruct
    public void setup() {
        registry.config().meterFilter(
                new MeterFilter() {
                    @Override
                    public HistogramConfig configure(Meter.Id id, HistogramConfig config) {
                        if(id.getName().startsWith("http.server.requests")) {
                            return HistogramConfig.builder()
                                    .histogramBufferLength(5)
                                    .percentilesHistogram(true)
                                    .build()
                                    .merge(config);
                        }
                        return config;
                    }
                });
    }
}
