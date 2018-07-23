package com.vig.devjf.kafka.producer.config;

import com.vig.devjf.kafka.producer.output.StreamProducer;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding({StreamProducer.class})
public class StreamConfig {
}
