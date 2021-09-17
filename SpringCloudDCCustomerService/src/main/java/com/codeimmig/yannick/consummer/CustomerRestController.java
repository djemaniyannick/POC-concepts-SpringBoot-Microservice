package com.codeimmig.yannick.consummer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cust")
public class CustomerRestController {
	@Autowired
	private OrderRestConsummer consummer;
	@GetMapping("/info")
	public String getCustInfo() {
		return "FROM CUST=>"+consummer.getOrderData();
	}

}
