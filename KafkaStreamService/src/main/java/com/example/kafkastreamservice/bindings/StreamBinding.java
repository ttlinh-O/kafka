package com.example.kafkastreamservice.bindings;

import org.apache.kafka.streams.kstream.KStream;

public interface StreamBinding {

    KStream<String, Order> inputStream();
    KStream<String, Order> takeAwayStream();
    KStream<String, Order> homeStream();
}
