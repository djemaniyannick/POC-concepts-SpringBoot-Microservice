package com.example.yannick.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Component
public class Product {
	
	@Value("${my.app.id}")
    private Integer prodId;
    @Value("${my.app.code}")
    private String prodCode;
    @Value("${my.app.cost}")
    private Double prodCost;
	

}
