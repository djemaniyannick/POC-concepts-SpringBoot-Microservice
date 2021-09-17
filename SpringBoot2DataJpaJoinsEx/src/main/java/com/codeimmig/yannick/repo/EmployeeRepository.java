package com.codeimmig.yannick.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.codeimmig.yannick.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// Get Emploeyees who are assiged to any one Department?
		@Query("SELECT e.empName,d.deptCode  FROM Employee e JOIN e.dob as d")
		//@Query("SELECT e.empName,d.deptCode  FROM Employee e INNER JOIN e.dob as d")
		public List<Object[]> getInnerJoinData();
		
		//Get All Employees and Their Dept Name if exist ?
		@Query("SELECT e.empName,d.deptCode  FROM Employee e LEFT OUTER JOIN e.dob as d")
		public List<Object[]> getLeftJoinData();
		
		//Get All Departments and their employees if exist?
		@Query("SELECT e.empName,d.deptCode  FROM Employee e RIGHT JOIN e.dob as d")
		//@Query("SELECT e.empName,d.deptCode  FROM Employee e RIGHT OUTER JOIN e.dob as d")
		public List<Object[]> getRightJoinData();
		
		
		@Query("SELECT e.empName,d.deptCode  FROM Employee e FULL JOIN e.dob as d")
		public List<Object[]> getFullJoinData();
		
		@Query("SELECT e.empName,d.deptCode  FROM Employee e JOIN e.dob as d WHERE e.empId=:a")
			public List<Object[]> getInnerJoinDataA(Integer a);
			
			@Query("SELECT e.empName,d.deptCode  FROM Employee e LEFT OUTER JOIN e.dob as d WHERE d IS NULL")
			public List<Object[]> getLeftJoinDataNonConn();
			
			@Query("SELECT e.empName,d.deptCode  FROM Employee e RIGHT OUTER JOIN e.dob as d WHERE e IS NULL")
			public List<Object[]> getLeftJoinData1NonConn();
	

}
