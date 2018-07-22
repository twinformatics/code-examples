package com.vig.devjf.kafka.consumer.config;

import com.vig.devjf.kafka.consumer.input.StreamConsumer;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding({StreamConsumer.class})
public class StreamConfig {
}
