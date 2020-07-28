package com.trushil.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trushil.springdemo.entity.Student;

@RestController
@RequestMapping("/test")
public class DemoRestController {
	List<Student> students = new ArrayList<Student>();

	public DemoRestController() {
		students.add(new Student("Trushil", "Patel"));
		students.add(new Student("Harshil", "Patel"));
	}

	// add code for the "/hello" endpoint

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!";
	}

	@PostMapping("/student")
	public List<Student> student() {

		return this.students;
	}

	@GetMapping("/student/{id}")
	public Student specificStudent(@PathVariable int id) {

		if (id > 1) {
			throw new StudentNotFoundException("Student not found");
		}
		return students.get(id);
	}

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exce) {

		StudentErrorResponse error = new StudentErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage("Hey Error is here for your service");
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<StudentErrorResponse>(error, HttpStatus.NOT_FOUND);
	}

}
