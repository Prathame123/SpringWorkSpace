package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.example.client.OrderClient;

public class OrderController {

	 private final OrderClient orderClient;

	    public OrderController(OrderClient orderClient) {
	        this.orderClient = orderClient;
	    }

	    @GetMapping("/orders")
	    public String getOrders() {
	        String customerResponse = orderClient.getOrders();
	        return "Order service using Feign client -> " + customerResponse;
	    }
}