package com.example.orderservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/display")
    public String display() {
        String message = "Order Service running on port: " + port;
        System.out.println("Request handled by " + message);
        return message;
    }
}
