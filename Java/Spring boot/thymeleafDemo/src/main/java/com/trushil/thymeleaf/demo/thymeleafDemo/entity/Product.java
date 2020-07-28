package com.trushil.thymeleaf.demo.thymeleafDemo.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "master")
@Component
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_no")
    public int product_no;

    public Product(int product_no, String product_name, int price) {
        this.product_no = product_no;
        this.product_name = product_name;
        this.price = price;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_no=" + product_no +
                ", product_name='" + product_name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setProduct_no(int product_no) {
        this.product_no = product_no;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Column(name = "product_name" )
    public String product_name;

    @Column(name = "price")
    public int price;

    public int getProduct_no() {
        return product_no;
    }

    public String getProduct_name() {
        return product_name;
    }

    public int getPrice() {
        return price;
    }
}
