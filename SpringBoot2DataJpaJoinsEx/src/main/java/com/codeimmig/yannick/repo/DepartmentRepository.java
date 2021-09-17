package com.codeimmig.yannick.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeimmig.yannick.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
