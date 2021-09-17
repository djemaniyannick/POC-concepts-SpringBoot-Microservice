package com.codeimmig.yannick.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.codeimmig.yannick.model.Department;
import com.codeimmig.yannick.model.Employee;
import com.codeimmig.yannick.repo.DepartmentRepository;
import com.codeimmig.yannick.repo.EmployeeRepository;

@Component
public class CommandLineRunne implements CommandLineRunner {

	@Autowired
	private DepartmentRepository drepo;

	@Autowired
	private EmployeeRepository erepo;

	public void run(String... args) throws Exception {

		Department d1 = new Department(501, "DEV");
		Department d2 = new Department(502, "QA");
		Department d3 = new Department(503, "BA");
		Department d4 = new Department(504, "ADMIN");

		drepo.save(d1);
		drepo.save(d2);
		drepo.save(d3);
		drepo.save(d4);

		Employee e1 = new Employee(10, "SAM", null);
		Employee e2 = new Employee(11, "SYED", d1);
		Employee e3 = new Employee(12, "AJAY", null);
		Employee e4 = new Employee(13, "RAM", d3);

		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		erepo.save(e4);

		// List<Object[]> list = erepo.getFullJoinData();
		// List<Object[]> list = erepo.getInnerJoinData();
		List<Object[]> list = erepo.getLeftJoinData();
		// List<Object[]> list = erepo.getRightJoinData();
		System.out.println("**** query *****************");
		for (Object[] ob : list) {
			System.out.println(ob[0] + "-" + ob[1]);
		}
	}
}
