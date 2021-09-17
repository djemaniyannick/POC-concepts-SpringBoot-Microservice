package com.codeimmig.yannick.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.codeimmig.yannick.model.Department;
import com.codeimmig.yannick.model.Employee;
import com.codeimmig.yannick.repo.DepartmentRepo;
import com.codeimmig.yannick.repo.EmployeeRepository;


@Component
public class DataInserRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository erepo;
	
	@Autowired
	private DepartmentRepo drepo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Department d1 = new Department(5, "DEV");
		Department d2 = new Department(6, "QA");
		
		drepo.save(d1);
		drepo.save(d2);
		
		Employee e1 = new Employee(10, "SAM", d1);
		Employee e2 = new Employee(11, "SYED", d1);
		
		Employee e3 = new Employee(12, "AJAY", d2);
		Employee e4 = new Employee(13, "KHAN", d2);
		Employee e5 = new Employee(14, "XYZ", null);
		
		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		erepo.save(e4);
		erepo.save(e5);
		
	}

}
