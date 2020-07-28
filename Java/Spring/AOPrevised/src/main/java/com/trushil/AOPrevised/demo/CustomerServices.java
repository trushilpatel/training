package com.trushil.AOPrevised.demo;

import org.springframework.stereotype.Component;

import com.trushil.AOPrevised.entity.Customer;

@Component
public class CustomerServices {
	
	public void addCustomer(Customer customer) {
		System.out.println("Customer added : " + customer);
	}
}
