package com.trushil.thymeleaf.demo.thymeleafDemo.repository;

import com.trushil.thymeleaf.demo.thymeleafDemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}

