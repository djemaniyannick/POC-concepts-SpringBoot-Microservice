package com.codeimmig.yannick.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


import com.codeimmig.yannick.model.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{
	
//	@Query("select s.stdName from Student s")
//	List<String> getStudNames();
//	
//	@Query("select s from Student s")
//	List<Student> getAllStudents();
	
	@Query("SELECT s.stdName FROM  com.codeimmig.yannick.model.Student s")
	List<String> getStudentNames();
	
	@Query("SELECT stdId,stdName FROM Student")
	List<Object[]> getStudentIdAndNames();
	
	@Query("SELECT s FROM Student s ") 
	List<Student> getAllStudents();
	
	@Query("SELECT s.stdName FROM Student s WHERE s.stdId>?1")
	List<String> getStudentNamesById(Integer sid);
	
	@Query("SELECT s.stdName FROM Student s WHERE s.stdId>?1 or s.stdFee<=?2")
	List<String> getStudentNamesByInput(Integer sid,Double stdFee);
	
	@Query("SELECT stdName FROM Student where stdName like :sname")
	List<String> getDataA(String sname);
	
	@Query("SELECT stdName FROM Student where stdId between :a and :b")
	List<String> getDataC(Integer a, Integer b);
	
	//@Query("SELECT stdName FROM Student where stdName IS NULL")
	@Query("SELECT stdName FROM Student where stdName IS NOT NULL")
	List<String> getDataD();
	
	//====================Native SQL===============================
		@Query(value = "select * from stdtab where sid>:a",nativeQuery = true)
		List<Student> getDataE(Integer a);
		
		//============================ for non select operation =============================================
		@Modifying
		@Transactional
		@Query("UPDATE Student SET stdName=:a WHERE stdId=:b")
		int updateStudentById(String a, Integer b);
		
		@Modifying
		@Transactional
		@Query("DELETE FROM Student WHERE stdName=:a")
		int deleteStudentByName(String a);
		
}
