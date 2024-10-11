package com.example.tp1spring.services;

import com.example.tp1spring.entity.Order;
import com.example.tp1spring.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    public List<Order> getAllOrder(){
        return orderRepo.findAll();
    }


}
