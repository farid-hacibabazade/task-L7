package com.example.task_L7.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String processPayment(String paymentType) {
        return "Processing " + paymentType + " payment";
    }
}
