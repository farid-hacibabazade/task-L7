package com.example.task_L7.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class OrderService {

    List<String> orders = new ArrayList<>();

    public List<String> getOrders() {
        return orders;
    }
}
