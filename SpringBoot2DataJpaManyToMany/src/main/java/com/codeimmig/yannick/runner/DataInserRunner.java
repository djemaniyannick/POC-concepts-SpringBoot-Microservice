package com.codeimmig.yannick.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.codeimmig.yannick.model.Course;
import com.codeimmig.yannick.model.Student;
import com.codeimmig.yannick.repo.CourseRepository;
import com.codeimmig.yannick.repo.StudentRepository;

@Component
public class DataInserRunner implements CommandLineRunner {
	@Autowired
	private CourseRepository crepo;
	
	@Autowired
	private StudentRepository srepo;
	
	

	@Override
	public void run(String... args) throws Exception {
		
		Course c1 = new Course(52,"CJ",1200.0);
		Course c2 = new Course(53,"AJ",2500.0);
		Course c3 = new Course(54,"SM",5000.0);
		
		crepo.save(c1);
		crepo.save(c2);
		crepo.save(c3);
		
		Student s1=new Student(10, "SAM", Set.of(c1, c2));
		Student s2=new Student(11, "SYED", Set.of(c2, c3));
		srepo.save(s1);
		srepo.save(s2);
		
		
		
	}

}
