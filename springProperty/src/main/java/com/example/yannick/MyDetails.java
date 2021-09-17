package com.example.yannick;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyDetails {
	@Value("${my.app.title}")
	private String ttl;
	
	@Value("${my.app.version}")
	private Double ver;
	
	@Value("${my.app.clientId}")
	private Integer cid;

	@Override
	public String toString() {
		return "MyDetails [ttl=" + ttl + ", ver=" + ver + ", cid=" + cid + "]";
	}

}
