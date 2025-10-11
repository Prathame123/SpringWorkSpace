package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/orders")
    public String getOrders() {
        String customerResponse = restTemplate.getForObject("http://customer-service/customers", String.class);
        return "Order service is working and calling -> " + customerResponse;
    }
}