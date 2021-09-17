package com.codeimmig.yannick.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.codeimmig.yannick.sertvice.ProducerService;

@Component
public class TestProducer {
	@Autowired
	private ProducerService service;
	//@Override
	//public void run(String... args) throws Exception {
	@Scheduled(fixedDelay = 5000)
	public void send()  throws Exception{
		System.out.println("DATA IS SENDING");
		service.sendMessage("HELLO " +new Date());
	}

}
