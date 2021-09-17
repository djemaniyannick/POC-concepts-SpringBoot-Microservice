package com.codeimmig.yannick.service;

import java.util.List;
import java.util.Optional;

import com.codeimmig.yannick.model.Employee;

public interface IEmployeeService {
	Integer saveEmployee(Employee e);
	void updateEmployee(Employee e);
	void deleteEmployee(Integer id);
	Employee getOneEmployee(Integer id);
	List<Employee> getAllEmployees();
}
