package com.example.tp1spring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String name;
    float price;
    String description;



    @ManyToOne
    @JoinColumn(name="id_provider")
    Provider provider;

    @ManyToMany
    @JoinTable(name="Product_order",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name ="order_id" ))
    List<Order> orders=new ArrayList<>();



    @OneToMany(mappedBy = "product",cascade = CascadeType.REMOVE)
    List<Subcategory> subcategories=new ArrayList<>();



}
