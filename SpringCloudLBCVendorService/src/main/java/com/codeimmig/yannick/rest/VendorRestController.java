package com.codeimmig.yannick.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeimmig.yannick.consummer.ContractRestConsumer;

@RestController
@RequestMapping("/vendor")
public class VendorRestController {
	@Autowired
	private ContractRestConsumer consummer;
	@GetMapping("/data")
	public String getVenInfo() {
		return "FROM VENDOR=> "+consummer.getData();
	}

}
