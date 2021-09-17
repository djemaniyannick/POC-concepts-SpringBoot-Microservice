package com.codeimmig.yannick.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
	private Integer pid;
	private String code;
	private double  pcost;
	
}
