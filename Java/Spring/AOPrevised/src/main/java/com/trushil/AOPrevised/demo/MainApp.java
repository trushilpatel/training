package com.trushil.AOPrevised.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.trushil.AOPrevised.entity.Customer;

public class MainApp {
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfiguration.class);
		
		CustomerServices cs = context.getBean("customerServices", CustomerServices.class);
		
		cs.addCustomer(new Customer());
	}
}
