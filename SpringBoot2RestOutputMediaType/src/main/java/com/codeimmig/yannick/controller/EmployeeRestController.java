package com.codeimmig.yannick.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeimmig.yannick.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	@GetMapping("/fetch")
	public ResponseEntity<Employee>getOneEmployee(){
		Employee body=new Employee(101, "SYED", 300.0);
		ResponseEntity<Employee> responseEntity=new ResponseEntity<Employee>(body, HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping("/testa")
	public String getOneMessage() {
		return "Hello World!!";
	}

	@GetMapping("/fetcha")
	public Employee getOneEmployee2() {
		Employee body = 
				new Employee(102, "SAM", 400.0);
		return body;
	}

	@GetMapping("/fetchb")
	public List<Employee> getOneEmployee3() {	
		return Arrays.asList(
				new Employee(102, "SAM", 400.0),
				new Employee(103, "JAM", 500.0),
				new Employee(104, "KAM", 600.0),
				new Employee(105, "OAM", 700.0)
				);
	}


	@GetMapping("/fetchd")
	public Map<String,Employee> getOneEmployee4() {
		return Map.of(
				"E1", new Employee(102, "SAM", 400.0),
				"E2", new Employee(103, "JAM", 500.0),
				"E3", new Employee(104, "KAM", 600.0),
				"E4", new Employee(105, "OAM", 700.0)
				);
	}

}
