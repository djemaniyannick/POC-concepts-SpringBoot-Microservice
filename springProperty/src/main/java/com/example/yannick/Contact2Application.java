package com.example.yannick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({
	"classpath:myData.properties",
	"classpath:abc.properties"})
public class Contact2Application {

	public static void main(String[] args) {
		SpringApplication.run(Contact2Application.class, args);
ApplicationContext ac =  SpringApplication.run(Contact2Application.class, args);
		Object ob = ac.getBean("myDetails");
		System.out.println(ob);
	}

}
