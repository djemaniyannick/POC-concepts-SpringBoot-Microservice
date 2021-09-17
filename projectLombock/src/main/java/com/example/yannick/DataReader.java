package com.example.yannick;

import java.util.List;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "my.app")
public class DataReader implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		private List<String> prjs;
		//private Set<String> prjs;
		//private String[] prjs;
		private Map<String,String> clients;
		
		System.out.println(clients.getClass().getName());
		//core java
		System.out.println(this);
		
	}

}
