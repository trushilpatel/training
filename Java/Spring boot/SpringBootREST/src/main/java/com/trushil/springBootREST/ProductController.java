package com.trushil.springBootREST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trushil.springBootREST.dao.ProductDAOimp;
import com.trushil.springBootREST.entity.Product;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	private ProductDAOimp productDAO;
	
	@Autowired
	public ProductController(ProductDAOimp productDAO) {
		this.productDAO = productDAO;
		System.out.println(productDAO);
	}
	
	@GetMapping("/products")
	public List<Product> findAll(){
		
		return productDAO.findAll();
	}
	
	@GetMapping("/products/{productID}")
	public Product findOne(@PathVariable int productID) {
		System.out.println("products " + productID);
		return productDAO.findOne(productID);
	}
	
	@PostMapping("/products")
	public void update(@RequestBody Product product) {
		System.out.println(product);
		productDAO.update(product);
	}
	
	@DeleteMapping("/products/{productID}")
	public void update(@PathVariable int productID) {
		productDAO.delete(productID);
	}
}
