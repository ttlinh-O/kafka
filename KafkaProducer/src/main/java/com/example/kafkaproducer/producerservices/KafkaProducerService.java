package com.example.kafkaproducer.producerservices;

import com.example.kafkaproducer.model.Order;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaProducerService {
    private static final String TOPIC = "user";
    private final KafkaTemplate<String, Order> kafkaTemplate;

    public void send(Order order) {
        log.info("Object order is {}", order);
        kafkaTemplate.send(TOPIC, UUID.randomUUID().toString(), order);
    }
}
