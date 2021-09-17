package com.codeimmig.yannick.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="emp_tab")
public class Employee {
	@Id
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="didFk")
	private Department dob; //HAS-A
	

}
