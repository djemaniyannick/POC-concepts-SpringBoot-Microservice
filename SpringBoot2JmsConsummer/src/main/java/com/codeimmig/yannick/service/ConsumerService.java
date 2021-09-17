package com.codeimmig.yannick.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {
	@JmsListener(destination = "my-queue-1")
	public void readData(String message) {
		System.out.println("DATA IS =>  :"+message);
	}

}
