package com.mvcForms.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@RequestMapping("/")
	public String homePage() {
		return "main-page";
	}
}
