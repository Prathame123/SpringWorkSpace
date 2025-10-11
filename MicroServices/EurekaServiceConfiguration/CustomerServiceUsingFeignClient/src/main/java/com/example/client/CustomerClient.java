package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "CustomerService")
public interface CustomerClient {

 @GetMapping("/customers")
 String getCustomers();
}