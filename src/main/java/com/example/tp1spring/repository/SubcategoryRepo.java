package com.example.tp1spring.repository;

import com.example.tp1spring.entity.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubcategoryRepo extends JpaRepository<Subcategory, Long> {
}
