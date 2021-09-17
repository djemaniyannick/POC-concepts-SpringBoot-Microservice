package com.codeimmig.yannick.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity(name = "stdtab")
public class Student {
	@Id
	@Column(name ="sid")
	private Integer stdId;
	
	@Column(name ="sname")
	private String  stdName;
	
	@Column(name ="stdFee")
	private Double stdFee;
	
}