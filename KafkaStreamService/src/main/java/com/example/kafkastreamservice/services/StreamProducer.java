package com.example.kafkastreamservice.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;

@Slf4j
@RequiredArgsConstructor
public class StreamProducer {

    private static final String DIESTINATION = "";
    private final StreamBridge streamBridge;


}
