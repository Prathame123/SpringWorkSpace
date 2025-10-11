package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.client.CustomerClient;

public class CustomerController {
    private final CustomerClient customerClient;

    public CustomerController(CustomerClient customerClient) {
        this.customerClient = customerClient;
    }

    @GetMapping("/customers")
    public String getOrders() {
        String customerResponse = customerClient.getCustomers();
        return "Customer service using Feign client -> " + customerResponse;
    }
}
