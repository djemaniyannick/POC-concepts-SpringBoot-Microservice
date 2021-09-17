package com.codeimmig.yannick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codeimmig.yannick.model.Product;

@Controller
public class ProductController {
	@GetMapping("/show")
	public String showData(Model model) {
		Product product=new Product(100,"parfum",55.50);
		model.addAttribute("pob", product);
		return "ShowData";
	}

}
