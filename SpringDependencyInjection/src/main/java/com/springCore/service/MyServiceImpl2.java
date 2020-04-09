package com.springCore.service;

import org.springframework.stereotype.Component;

@Component("service2")
//@Primary
public class MyServiceImpl2 implements MyService {

	public String getInfo() {
		return "Service2's Info";
	}

}
