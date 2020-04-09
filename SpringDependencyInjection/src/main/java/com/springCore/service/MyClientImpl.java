package com.springCore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("client")
public class MyClientImpl implements MyClient {
	
	@Autowired
	@Qualifier("service2")
	private MyService myService;
	
	public void doSomething() {
		String info=myService.getInfo();
		System.out.println(info);
	}

}
