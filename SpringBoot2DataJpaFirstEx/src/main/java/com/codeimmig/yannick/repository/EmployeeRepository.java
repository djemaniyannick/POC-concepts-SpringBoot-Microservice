package com.codeimmig.yannick.repository;

import org.springframework.data.repository.CrudRepository;

import com.codeimmig.yannick.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
