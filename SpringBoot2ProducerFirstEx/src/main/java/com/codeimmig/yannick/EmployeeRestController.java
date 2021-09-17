package com.codeimmig.yannick;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	@GetMapping("/all")
	public ResponseEntity<String> viewEmployees(){
		String body="WELCOME TO VIEW EMPLOYEE";
		ResponseEntity<String> response=new ResponseEntity<String>(body, HttpStatus.OK);
		return response;
	}
	@PostMapping("/create")
	public ResponseEntity<String> saveEmployee(){
		String body="WELCOME TO SAVE";
		ResponseEntity<String> response=new ResponseEntity<String>(body, HttpStatus.OK);
		return response;
	}
	@PutMapping("/modify")
	public ResponseEntity<String> updateEmployee(){
		String body="WELCOME TO MODIFY";
		ResponseEntity<String> response=new ResponseEntity<String>(body, HttpStatus.OK);
		return response;
	}
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteEmployee(){
		String body="WELCOME TO DELETE";
		ResponseEntity<String> response=new ResponseEntity<String>(body, HttpStatus.OK);
		return response;
	}
	@PatchMapping("/salupdate")
	public ResponseEntity<String> updateEmpSalById(){
		String body="WELCOME TO SAL UPDATE";
		ResponseEntity<String> response=new ResponseEntity<String>(body, HttpStatus.OK);
		return response;
	}

}
