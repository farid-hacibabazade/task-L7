package com.example.task_L7.controller;

import com.example.task_L7.service.OrderService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public List<String> getOrders() {
        return orderService.getOrders();
    }
}
