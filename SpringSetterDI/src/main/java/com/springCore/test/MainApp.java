package com.springCore.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springCore.config.AppConfig;
import com.springCore.service.Company;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Company company=ctx.getBean(Company.class);
		company.showDepartmentInfo();
		ctx.close();
	}

}
