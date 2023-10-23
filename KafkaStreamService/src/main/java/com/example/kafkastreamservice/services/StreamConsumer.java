package com.example.kafkastreamservice.services;

import com.example.kafkastreamservice.bindings.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Slf4j
@Component
public class StreamConsumer {

    @Bean
    public Consumer<Message<Order>> takeAway() {
        return event -> {
            log.info("Processing takeAway: {}", event);
        };
    }

    @Bean
    public Consumer<Message<Order>> homeDelivery() {
        return event -> {
            log.info("Processing homeDelivery: {}", event);
        };
    }
}
