package com.codeimmig.yannick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codeimmig.yannick.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@GetMapping("/register")
	public String showReg() {
		return "Register";
	}
	@PostMapping("/save")
	public String readformData(@ModelAttribute Employee employee,Model model){
		System.out.println(employee);
		model.addAttribute("emp", employee);
		return "Data";
		
	}
}
