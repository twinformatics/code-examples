package com.vig.devjf.kafka.producer.output;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@RequiredArgsConstructor
@Component
@Slf4j
public class Producer {

    private final StreamProducer streamProducer;

    private AtomicInteger i = new AtomicInteger();

    @Scheduled(fixedRate = 1000)
    public void run() {
        int i = this.i.incrementAndGet();
        log.info("<-- " + i);
        streamProducer.ticksOutput().send(MessageBuilder.withPayload(i).build());
    }
}
