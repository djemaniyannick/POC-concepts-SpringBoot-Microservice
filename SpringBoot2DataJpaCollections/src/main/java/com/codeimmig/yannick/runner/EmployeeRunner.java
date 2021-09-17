package com.codeimmig.yannick.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.codeimmig.yannick.model.Employee;
import com.codeimmig.yannick.repository.EmployeeRepository;

@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(
				new Employee(10, "A", 3.3, 
						Set.of("NIT","ORCL"), 
						Map.of("M1",2.3,"M2",2.3,"M3",3.1),
						List.of("CRN","PQR")
						)
				);
		
	}

}
