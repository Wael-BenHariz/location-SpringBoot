package com.example.tp1spring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer extends User implements Serializable {

    String adress;
    String city;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.REMOVE)
    List<Order> orders;
}
