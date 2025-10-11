package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "OrderService")
public interface OrderClient {

	 @GetMapping("/orders")
	 String getOrders();
}