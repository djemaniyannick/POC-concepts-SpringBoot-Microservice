package com.codeimmig.yannick.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeimmig.yannick.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
