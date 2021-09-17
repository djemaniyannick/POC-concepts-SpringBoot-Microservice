package com.example.yannick.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;

import com.example.yannick.service.MyEmailService;

public class TestMailRunner implements CommandLineRunner {
	@Autowired
	private MyEmailService service;

	@Override
	public void run(String... args) throws Exception {
		FileSystemResource fileSystemResource=new FileSystemResource("D:/Naresh It/SpringBoot630AM_03052021.png");
		boolean send=service.send(
				"abenapaulo237@gmail.com", 
				null, 
				null, 
				"Welcome to my new account", 
				"<html><body><h3>I am happy to create this account !</h3><b></b> <p>Hello All</p></body></html>", 
				fileSystemResource);
		if(send) {
			System.out.println(" Email sent successfully");
		}else {
			System.out.println(" Email not sent ");
			
		}
	}

}
