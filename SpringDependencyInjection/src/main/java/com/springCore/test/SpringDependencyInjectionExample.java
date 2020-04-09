package com.springCore.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springCore.service.MyClient;

public class SpringDependencyInjectionExample {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
	    ctx.scan("com.springCore.service");
	    ctx.refresh();
		 
		MyClient myClient=ctx.getBean(MyClient.class,"client");
		myClient.doSomething();
		ctx.close();
	}

}
