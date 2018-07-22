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
    public void consumeTicksInput(String tickNumber) throws InterruptedException {
        
        log.info("(Thread {}) --> {}",  Thread.currentThread().getId(), tickNumber);
    }

    //        if (Integer.valueOf(tickNumber) % 20 == 0) {
//                throw new IllegalArgumentException("folgende zahlen sind kaputt: " + tickNumber);
//                }
//
//@SendTo("ticksOutput")
//    @StreamListener("ticksInput1000")
//    public void consumeTicksInput1000(String tickNumber) {
//        log.info("(Thread {}) topic2 --> {}",  Thread.currentThread().getId(), tickNumber);
//    }
//    @SendTo("ticksOutput")
}

