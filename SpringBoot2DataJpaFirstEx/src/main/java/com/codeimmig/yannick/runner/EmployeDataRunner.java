package com.codeimmig.yannick.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.codeimmig.yannick.model.Employee;
import com.codeimmig.yannick.repository.EmployeeRepository;

@Component
public class EmployeDataRunner implements  CommandLineRunner {
	@Autowired
	private EmployeeRepository employeRepo;

	@Override
	public void run(String... args) throws Exception {
		employeRepo.save(new Employee(45, "yannick", 500.25));
		
	}
}
