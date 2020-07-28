package com.my.demo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {


	@RequestMapping("/")
	public String mainPage() {
		return "main-page";
	}

	@RequestMapping("/fillForm")
	public String fillForm(Model model) {
		
		StudentDetails student = new StudentDetails();
		
		model.addAttribute("Student", student);
		return "fill-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("Student") StudentDetails student,
			BindingResult theBindingResult
			) 
	{
		if (theBindingResult.hasErrors()) {
			return "fill-form";
		} else {
			return "process-form";
		}
		
	}
}
