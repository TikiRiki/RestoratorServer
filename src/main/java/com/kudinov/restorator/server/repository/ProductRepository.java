package com.kudinov.restorator.server.repository;

import com.kudinov.restorator.server.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
