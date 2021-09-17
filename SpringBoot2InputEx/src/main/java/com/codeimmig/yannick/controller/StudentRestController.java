package com.codeimmig.yannick.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeimmig.yannick.model.Student;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	@PostMapping("/create")
	public String createStudent(
			@RequestBody Student student) 
	{
		
		return "Hello Your data is => " + student;
	}

}
