package com.vig.devjf.kafka.consumer.input;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface StreamConsumer {

    @Input("ticksInput")
    SubscribableChannel ticksInput();

//    @Output("ticksOutput")
//    MessageChannel ticksOutput();
//
//
//    @Input("ticksInput1000")
//    SubscribableChannel ticksInput1000();

//    @Input("ticksInputError")
//    SubscribableChannel ticksInputError();
}
