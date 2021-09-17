package com.codeimmig.yannick.controller;

import java.util.Map;

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
	@GetMapping("/edit")
	public String showEdit(Model model) {
		Employee e = new Employee(); // repo.findById(empId);
		e.setEmpId(101);
		e.setEmpName("AAAA");
		e.setEmpSal(200.0);
		model.addAttribute("employee", e);
		Map<Integer, String> map=Map.of(11,"QA", 12, "Dev", 13,"BA", 14,"MGR");
		model.addAttribute("deptData", map);
		return "EmployeeEdit";
	}
	
	@PostMapping("/update")
	public String updateData(
			@ModelAttribute Employee employee,
			Model model
			) 
	{
		System.out.println("Form data is => " +employee);
		model.addAttribute("emp", employee);
		return "EmployeeSuccess";
	}
	

}
