package com.codeimmig.yannick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudLbcContractServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLbcContractServiceApplication.class, args);
	}

}
