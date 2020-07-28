package com.trushil.AOPrevised.entity;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	private String name;
	private String email;

	public Customer() {
	}

	Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
