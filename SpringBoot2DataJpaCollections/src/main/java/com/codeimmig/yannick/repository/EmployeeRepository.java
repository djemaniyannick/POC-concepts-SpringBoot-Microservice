package com.codeimmig.yannick.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeimmig.yannick.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
