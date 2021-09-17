package com.codeimmig.yannick.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import com.codeimmig.yannick.model.Student;
import com.codeimmig.yannick.repository.StudentRepository;

@Component
public class StudentRunner  implements CommandLineRunner{
	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Student(10,"AB",250.0));
		repo.save(new Student(14,"CB",150.0));
		repo.save(new Student(11,"II",280.0));
		repo.save(new Student(15,"MN",250.0));
		repo.save(new Student(12,"AC",350.0));
		repo.save(new Student(17,"RB",250.0));
		repo.save(new Student(13,"YY",210.0));
		repo.save(new Student(19,"EE",110.0));
		
		//Input that contains (pageNumber, page size)
		Pageable pageable=PageRequest.of(0, 4);
		// Page = content + metadata(first?,last?,size?,totalPage?,currentPage?,hasNext?...)
		Page<Student> page=repo.findAll(pageable);
		//content
		
		List<Student> studentList=page.getContent();
		studentList.forEach(System.out::println);
		System.out.println("-------------------------------------------------------------");
		
		//metadata
				System.out.println("Is First Page?" + page.isFirst());
				System.out.println("Is Last Page?" + page.isLast());
				System.out.println("has Next Page?" + page.hasNext());
				System.out.println("has Previous Page?" + page.hasPrevious());
				System.out.println("Total Pages Page?" + page.getTotalPages());
				System.out.println("Current Page?" + page.getNumber());
				System.out.println(" Page Size?" + page.getSize());
		
		
		//SQL: select * from stdtab order by sfee asc;
		//Sort s1 = Sort.by("stdFee"); //default
		
		//SQL: select * from stdtab order by sname asc;
		//Sort s1 = Sort.by(Direction.ASC, "stdName");
		
		//SQL: select * from stdtab order by sname desc;
		//Sort s1 = Sort.by(Direction.DESC, "stdName");

		//SQL: select * from stdtab order by sfee desc,sname desc;
		//Sort s1 = Sort.by(Direction.DESC,"stdFee","stdName");

		//SQL: select * from stdtab order by sfee desc,sname asc;
		//Sort s1 = Sort.by(Order.desc("stdFee"),Order.asc("stdName"));
		
		Sort s1 = Sort.by(Order.desc("stdFee"), Order.asc("stdName"));
		
		List<Student> list = repo.findAll(s1);
		for (Student stu : list) {
			System.out.println(stu);
			
		}
	}

}
