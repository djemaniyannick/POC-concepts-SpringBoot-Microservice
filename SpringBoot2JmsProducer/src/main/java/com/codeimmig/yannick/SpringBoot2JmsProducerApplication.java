package com.codeimmig.yannick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableScheduling
@SpringBootApplication
public class SpringBoot2JmsProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2JmsProducerApplication.class, args);
	}

}
