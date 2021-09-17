package com.codeimmig.yannick.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeimmig.yannick.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{
	

}
