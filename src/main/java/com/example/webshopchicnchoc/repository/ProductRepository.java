package com.example.webshopchicnchoc.repository;

import com.example.webshopchicnchoc.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
