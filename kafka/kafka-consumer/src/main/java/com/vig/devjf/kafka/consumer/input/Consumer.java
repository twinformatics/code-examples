package com.vig.devjf.kafka.consumer.input;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class Consumer {

    @StreamListener("ticksInput")
    public void consumeTicksInput(String tickNumber) {

        log.info("--> {}", tickNumber);

//        log.info("{} --> {}",  Thread.currentThread().getId(), tickNumber);
    }
}