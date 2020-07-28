package com.trushil.springBootREST.dao;

import java.util.List;

import com.trushil.springBootREST.entity.Product;

public interface ProductDAO {
	public List<Product> findAll();
	public Product findOne(int id);
	public void update(Product product);
	public void delete(int id);
}
