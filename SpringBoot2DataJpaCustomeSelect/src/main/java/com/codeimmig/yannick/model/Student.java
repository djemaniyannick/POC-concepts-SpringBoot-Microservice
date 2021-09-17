package com.codeimmig.yannick.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="stdtab")
public class Student {
	@Id
	@Column(name ="sid")
	private Integer stdId;
	
	@Column(name ="sname")
	private String  stdName;
	
	@Column(name ="sfee")
	private Double stdFee;
	
}