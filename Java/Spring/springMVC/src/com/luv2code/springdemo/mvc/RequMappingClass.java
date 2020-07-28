package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/new")
public class RequMappingClass {

	@RequestMapping("/nothing")
	public String nothing() {
		return "nothing";
	}
}
