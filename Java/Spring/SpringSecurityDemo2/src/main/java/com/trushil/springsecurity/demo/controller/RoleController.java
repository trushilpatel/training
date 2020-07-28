package com.trushil.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/role")
public class RoleController {

	@GetMapping("/")
	public String homePage() {
		return "home";
	}

	@GetMapping("/leader")
	public String leaderPage() {
		return "leader-page";
	}

	@GetMapping("/admin")
	public String adminPage() {
		return "admin-page";
	}

}
