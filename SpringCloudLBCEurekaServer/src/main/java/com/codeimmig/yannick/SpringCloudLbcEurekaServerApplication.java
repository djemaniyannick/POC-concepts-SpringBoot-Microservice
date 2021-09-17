package com.codeimmig.yannick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudLbcEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLbcEurekaServerApplication.class, args);
	}

}
