package com.my.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class demoController {
	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
}
