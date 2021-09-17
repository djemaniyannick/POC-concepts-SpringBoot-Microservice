package com.codeimmig.yannick.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	private  Integer empId;
	private String empName;
	private Double empSal;
	private String empPwd;
	private String empGen;
	private String empAddr;
	private String empPrj;
	private List<String> empLang;
	private List<String> empClients;
}
