package com.vig.devjf.kafka.producer.key;

import org.springframework.cloud.stream.binder.PartitionKeyExtractorStrategy;
import org.springframework.messaging.Message;

public class PartitionKeyExtractor implements PartitionKeyExtractorStrategy {

    @Override
    public Object extractKey(Message<?> message) {
        return 0;
    }
}
