package com.codeimmig.yannick.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeimmig.yannick.exception.EmployeeNotFoundException;
import com.codeimmig.yannick.model.Employee;
import com.codeimmig.yannick.repository.EmployeeRepository;
import com.codeimmig.yannick.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Integer saveEmployee(Employee e) {
		var esal = e.getEmpSal();
		var hra = esal * 20/100.0;
		var ta = esal * 10/100.0;

		//set data back to object
		e.setEmpHra(hra);
		e.setEmpTa(ta);

		//save object 
		var id = repo.save(e).getEmpId();

		return id;
	}

	@Override
	public void updateEmployee(Employee e) {
		if(repo.existsById(e.getEmpId())) {
			var esal = e.getEmpSal();
			var hra = esal * 20/100.0;
			var ta = esal * 10/100.0;

			//set data back to object
			e.setEmpHra(hra);
			e.setEmpTa(ta);
			repo.save(e);
		}
		
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	@Override
	public Employee getOneEmployee(Integer id) {
		// TODO Auto-generated method stub
		Optional<Employee> optional=repo.findById(id);
		if (optional.isPresent()) {
			return optional.get();
			
		}else {
			throw new EmployeeNotFoundException("EMPLOYEE '"+id+"' NOT EXIST");
		}
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee>	employees=repo.findAll();
		return employees
				.stream()
				.sorted((e1,e2)->e1.getEmpId().compareTo(e2.getEmpId()))
				.collect(Collectors.toList());
		}

}
