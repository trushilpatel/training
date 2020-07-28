package com.student.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {


	@RequestMapping("/")
	public String mainPage() {
		return "main-page";
	}

//	@RequestMapping("/fillForm")
//	public String fillForm(Model model) {
//		
//		StudentDetails student = new StudentDetails();
//		
//		model.addAttribute("Student", student);
//		return "fill-form";
//	}
//	
//	@RequestMapping("/processForm")
//	public String processForm(@ModelAttribute("Student") StudentDetails student) {
//		System.out.println(student.firstName + " " + student.lastName);
//		return "process-form";
//	}
}
