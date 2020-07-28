package com.trushil.springBootREST;

import java.util.List;
import java.util.Optional;

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
import com.trushil.springBootREST.entity.ProductRepository;
@RestController
@RequestMapping("/api")
public class ProductController {
	
	private ProductRepository productRepository;
	
	@Autowired
	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@GetMapping("/products")
	public List<Product> findAll(){
		
		return productRepository.findAll();
	}
	
	@GetMapping("/products/{productID}")
	public Optional<Product> findOne(@PathVariable int productID) {
		System.out.println("products " + productID);
		return productRepository.findById(productID);
	}
	
	@PostMapping("/products")
	public void update(@RequestBody Product product) {
		System.out.println(product);
		productRepository.save(product);
	}
	
	@DeleteMapping("/products/{productID}")
	public void update(@PathVariable int productID) {
		productRepository.deleteById(productID);
	}
}
