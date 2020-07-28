package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String mainPage() {
		return "main-page";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "show-form-page";
	}
	
//	@RequestMapping("/processForm")
//	public String processForm() {
//		return "process-form-page";
//	}
	
	@RequestMapping("/processForm")
	public String processForm2(
			@RequestParam("username") String username, Model model) 
	{
		System.out.println("kem choo " + username);
		model.addAttribute("message", "Yo!" + username.toUpperCase());
		return "process-form-2-page";
	}
}
