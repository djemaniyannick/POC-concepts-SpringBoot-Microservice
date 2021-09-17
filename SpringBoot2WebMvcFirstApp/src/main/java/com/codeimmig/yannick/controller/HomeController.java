package com.codeimmig.yannick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	// GET, PATH: /show
		@RequestMapping(value = "/show", method = RequestMethod.GET)
		public String showHome() {
			return "HomePage";
		}
}
