package com.example.task_L7.controller;

import com.example.task_L7.service.PaymentService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public String pay(String type) {
        return paymentService.processPayment(type);
    }
}
