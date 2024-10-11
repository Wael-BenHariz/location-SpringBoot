package com.example.tp1spring.services;

import com.example.tp1spring.entity.Product;
import com.example.tp1spring.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    ProductRepo productRepo;

    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }
    public Product getProductById(Long id){
        return productRepo.findById(id).get();
    }


}

