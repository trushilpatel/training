package com.trushil.springdemo.dao;

import java.util.List;

import com.trushil.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCutomer(Customer customer);

	Customer getCustomer(int id);

	public void deleteCustomer(int id);
}
