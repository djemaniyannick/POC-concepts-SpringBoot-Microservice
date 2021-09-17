package com.codeimmig.yannick.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	@Value("${my.app.title}")
	private String title;
	
	@GetMapping("/info")
	public String printInfo() {
		return "DATA FROM CS =>"+title;
	}

}
