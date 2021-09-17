package com.codeimmig.yannick.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	private Integer empId;
	private String empName;
	private Double empSal;
	private String empDept;

}
