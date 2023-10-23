package com.example.kafkastreamservice.bindings;

import lombok.Data;

@Data
public class Order {
    private String item;
    private  int quantity;
    private String deliveryType;
}
