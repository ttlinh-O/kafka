package com.example.kafkaproducer.controller;

import com.example.kafkaproducer.model.Order;
import com.example.kafkaproducer.producerservices.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final KafkaProducerService kafkaProducerService;

    @PostMapping
    public void order(@RequestBody Order order) {
        kafkaProducerService.send(order);
    }
}
