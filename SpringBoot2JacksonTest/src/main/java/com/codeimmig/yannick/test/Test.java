package com.codeimmig.yannick.test;

import com.codeimmig.yannick.model.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		try {
			/*String json="{\"empId\":101,\"empName\":\"BB\",\"empSal\":20.0,\"empStat\":false,\"empGen\":\"F\"}";
			ObjectMapper om=new ObjectMapper();
			Employee employee=om.readValue(json, Employee.class);
			System.out.println(employee);*/
			
			Employee employee=new  Employee(10,"AA",20.0,Boolean.TRUE,'M',"TESTA");
			ObjectMapper oMapper=new ObjectMapper();
			String jsonString=oMapper.writeValueAsString(employee);
			
			System.out.println(jsonString);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
