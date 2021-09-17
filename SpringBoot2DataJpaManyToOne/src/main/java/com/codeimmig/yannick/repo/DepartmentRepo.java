package com.codeimmig.yannick.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeimmig.yannick.model.Department;

public interface DepartmentRepo  extends JpaRepository<Department, Integer>{

}
