package com.springCore.service;

import org.springframework.stereotype.Component;

@Component("service1")
public class MyServiceImpl1 implements MyService {

	public String getInfo() {
		return "Service1's Info";
	}

}
