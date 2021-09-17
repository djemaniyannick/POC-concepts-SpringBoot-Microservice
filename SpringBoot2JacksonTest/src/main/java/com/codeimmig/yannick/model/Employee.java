package com.codeimmig.yannick.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
	private Integer empId;
	private String empName;
	private Double empSal;
	private Boolean empStat;
	private Character empGen;
	@JsonIgnore
	private String empPwd;

}
