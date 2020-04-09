package com.springCore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springCore.service.Department;
import com.springCore.service.DepartmentImpl;

@Configuration
@ComponentScan(basePackages = "com.springCore.service")
public class AppConfig {
	
	@Bean
	public Department getDepartment() {
		return new DepartmentImpl();
	}
}
