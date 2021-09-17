package com.example.yannick.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.yannick.model.Product;

@Component
public class MyMessageRunner implements CommandLineRunner{
	@Autowired
	private Product prod;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM RUNNER CLASS!");
		System.out.println(prod); //toString
		
	}

}
