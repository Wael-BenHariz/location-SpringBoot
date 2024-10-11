package com.example.tp1spring.services;

import com.example.tp1spring.entity.Customer;
import com.example.tp1spring.entity.Product;
import com.example.tp1spring.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo customerRepo;
    public List<Customer> getAllCustomer() {
        return customerRepo.findAll();
    }



}
