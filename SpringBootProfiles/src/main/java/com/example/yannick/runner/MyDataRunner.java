package com.example.yannick.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class MyDataRunner implements CommandLineRunner{
	@Value("${my.app.title}")
	private String title;
	@Value("${my.app.db}")
	private String db;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
		
	}

}
