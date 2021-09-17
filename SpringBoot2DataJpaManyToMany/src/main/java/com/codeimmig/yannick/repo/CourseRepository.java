package com.codeimmig.yannick.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeimmig.yannick.model.Course;

public interface CourseRepository  extends JpaRepository<Course, Integer>{

}
