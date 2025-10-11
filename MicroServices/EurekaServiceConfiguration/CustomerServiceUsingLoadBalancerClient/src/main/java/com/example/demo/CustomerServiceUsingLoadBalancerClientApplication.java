package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@EnableDiscoveryClient
@SpringBootApplication
public class CustomerServiceUsingLoadBalancerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceUsingLoadBalancerClientApplication.class, args);
	}

    // 👇 This makes RestTemplate automatically resolve service names from Eureka
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}