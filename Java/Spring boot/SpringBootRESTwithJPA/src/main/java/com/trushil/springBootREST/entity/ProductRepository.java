package com.trushil.springBootREST.entity;
import org.springframework.data.jpa.repository.JpaRepository;

import com.trushil.springBootREST.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
