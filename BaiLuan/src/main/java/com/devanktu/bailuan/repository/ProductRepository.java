package com.devanktu.bailuan.repository;

import com.devanktu.bailuan.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
