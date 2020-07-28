package com.trushil.springBootJPA.SpringBootJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trushil.springBootJPA.SpringBootJPA.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
