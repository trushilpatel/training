package com.trushil.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trushil.springdemo.entity.Customer;
import com.trushil.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/")
	public String customerHome() {
		return "customer-home";
	}

	@GetMapping("/list")
	public String listCustomer(Model model) {
		model.addAttribute("customers", customerService.getCustomers());
		return "list-customers";
	}

	@GetMapping("/insert-form")
	public String insertForm(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "insert-form";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.saveCustomer(customer);
		System.out.println(customer);
		return "redirect:/customer/list";
	}

	@GetMapping("/update-customer")
	public String updateCustomer(@RequestParam("customerId") String idd,Model model) {
		Customer customer;

		if (idd == null) {
			customer = new Customer();
		} else {
			int id = Integer.parseInt(idd);
			customer = customerService.getCustomer(id);
		}
		model.addAttribute("customer", customer);
		System.out.println(customer);
		
		return "insert-form";
	}
	
	@GetMapping("/delete-customer")
	public String deleteCustomer(@RequestParam("customerId") String idd) {
		int id = Integer.parseInt(idd);
		System.out.println("Delete " + id);
		customerService.deleteCustomer(id);
		return "redirect:/customer/list";
	} 
}
