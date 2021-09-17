package com.codeimmig.yannick.consummer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ContractRestConsumer {
	@Autowired
	private LoadBalancerClient client;
	
	public String getData() {
		ServiceInstance si=client.choose("CONTRACT-SERVICE");
		String url=si.getUri()+"/contract/info";
		String resp = new RestTemplate().getForObject(url, String.class);
		return resp;
	}

}
