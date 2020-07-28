package com.trushil.springBootREST.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trushil.springBootREST.entity.Product;

@Repository
public class ProductDAOimp implements ProductDAO{

	private EntityManager entityManager;
	
	@Autowired
	public ProductDAOimp(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	
	@Override
	@Transactional
	public List<Product> findAll() {
		List<Product> products = entityManager.createQuery("from Product", Product.class).getResultList();
		
		System.out.println(products);
		
		return products;
	}


	
	@Override
	@Transactional
	public Product findOne(int id) {
		
		Product products = entityManager.find(Product.class, id);
		return products;
	}
	


	@Override
	@Transactional
	public void update(Product product) {
		product.setProduct_no(0);
		entityManager.merge(product);
	}
	


	@Override
	@Transactional
	public void delete(int id) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("delete from Product where product_no=:ID");
		
		query.setParameter("ID", id);
		query.executeUpdate();
	}
	
	

}
