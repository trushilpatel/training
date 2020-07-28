package com.trushil.springBootJPA.SpringBootJPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "master")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_no")
	private int product_no;

	@Column(name = "product_name")
	private String product;

	@Column(name = "price")
	private int price;

	@Override
	public String toString() {
		return "Product [product_no=" + product_no + ", product=" + product + ", price=" + price + "]";
	}

	public Product() {
		super();
	}

	public Product(int product_no, String product, int price) {
		super();
		this.product_no = product_no;
		this.product = product;
		this.price = price;
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
