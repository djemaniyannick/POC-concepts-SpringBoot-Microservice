package com.codeimmig.yannick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class SpringBoot2JmsConsummerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2JmsConsummerApplication.class, args);
	}

}
