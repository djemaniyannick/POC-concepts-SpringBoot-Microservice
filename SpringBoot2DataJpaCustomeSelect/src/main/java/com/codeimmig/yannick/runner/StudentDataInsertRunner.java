package com.codeimmig.yannick.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.codeimmig.yannick.model.Student;
//import com.codeimmig.yannick.model.Student;
import com.codeimmig.yannick.repository.StudentRepository;

@Component
public class StudentDataInsertRunner  implements CommandLineRunner{
	
	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Student(10,"A",2.2));
		repo.save(new Student(11,"B",3.2));
		repo.save(new Student(12,"C",4.3));
		repo.save(new Student(13,"D",5.0));
		repo.save(new Student(14,"E",4.8)); 
		
		System.out.println("------- Name of student------------------");
		List<String> list=repo.getStudentNames();
		list.forEach(System.out::println);
		
		System.out.println("------- Name and Id  of student------------------");
		List<Object[]> list1=repo.getStudentIdAndNames();
		list1
		.stream()
		.map(ob->ob[0]+"-"+ob[1])
		.forEach(System.out::println);
	
		System.out.println("------- all  student------------------");
		List<Student> students=repo.getAllStudents();
		students.forEach(System.out::println);
		
		System.out.println("-------  student Name by id ------------------");
		List<String> student=repo.getStudentNamesById(11);
		student.forEach(System.out::println);
		
		List<String> stud=repo.getStudentNamesByInput(10, 4.3);
		stud.forEach(System.out::println);
		
		//select name where it contains one char
		 repo.getDataA("_").forEach(System.out::println);
		//select name where it contains A char
		//repo.getDataA("%A%").forEach(System.out::println);

		  //select name where it contains one char
			repo.getDataA("%").forEach(System.out::println);
			//select name where it contains A char
			//repo.getDataA("%A%").forEach(System.out::println);
			
			//repo.getDataB(Arrays.asList(10,12,14,18,22,96)).forEach(System.out::println);
			//repo.getDataC(10,15).forEach(System.out::println);
			//repo.getDataD().forEach(System.out::println);
			//repo.getDataE(10).forEach(System.out::println);
			
			System.out.println("******************************Update student name *************************");
			int count = repo.updateStudentById("NEW NAME", 11);
			System.out.println(count);
			
		
	}

}
