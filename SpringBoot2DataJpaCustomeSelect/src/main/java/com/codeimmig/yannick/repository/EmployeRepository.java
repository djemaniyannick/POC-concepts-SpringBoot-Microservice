package com.codeimmig.yannick.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeimmig.yannick.model.Employee;

public interface EmployeRepository extends JpaRepository<Employee, Integer> {
	/*
	 * projection en java 
	 */
	interface MyView {
		//DT getVariable();
		String getEmpName();
		Double getEmpSal();
	}
	List<MyView>findByEmpDept(String empDept);
	
	interface MyViewTwo{
		String getEmpName();
		Integer getEmpId();
		String getEmpDept();
	}
	List<MyViewTwo> findByEmpProj(String empId);
		
		//SQL: select * from emptab where eid<?
		List<Employee> findByEmpIdLessThan(Integer empId);
	
		// select * from emptab where ied=? 
	List<Employee> findByEmpIdEquals(Integer empId);
	
		//SQL: select * from emptab where eid between ? and ?
		List<Employee> findByEmpIdBetween(Integer e1,Integer e2);
		
		//SQL: select * from emptab where eid != ?
		List<Employee> findByEmpIdNot(Integer e1);
		
		//SQL: select * from emptab where ename is null
		List<Employee> findByEmpNameIsNull();
		
		//SQL: select * from emptab where ename is not null
		List<Employee> findByEmpNameIsNotNull();
		//List<Employee> findByEmpNameNotNull();
		
		/***
		 * % - zero or more chars
		 * _ - one char
		 * 
		 */
		//SQL: select * from emptab where ename like ?
		List<Employee> findByEmpNameLike(String pattern);
		
		//SQL: select * from emptab where ename not like ?
		List<Employee> findByEmpNameNotLike(String pattern);
		
		//SQL: select * from emptab where ename like ?%
		List<Employee> findByEmpNameStartingWith(String pattern);
		
		//SQL: select * from emptab where ename like %?
		List<Employee> findByEmpNameEndingWith(String pattern);
		
		//SQL: select * from emptab where ename like %?%
		List<Employee> findByEmpNameContaining(String pattern);
		
		//===========================================//
		//SQL: select * from emptab where eid in (?)
		List<Employee> findByEmpIdIn(List<Integer> ids);
		
		//SQL: select * from emptab where eid in (?) and ename IS NOT NULL
		List<Employee> findByEmpIdInAndEmpNameIsNotNull(List<Integer> ids);
		
		//SQL: select * from emptab where eid>=? or esal<=? order by ename
		List<Employee> findByEmpIdGreaterThanEqualOrEmpSalLessThanEqualOrderByEmpName(Integer eid, Double esal);
		List<Employee> findByEmpIdGreaterThanEqualOrEmpSalLessThanEqualOrderByEmpNameDesc(Integer eid, Double esal);
		
		

}
;