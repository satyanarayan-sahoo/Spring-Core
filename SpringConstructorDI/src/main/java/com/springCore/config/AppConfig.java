package com.springCore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springCore.service.Employee;
import com.springCore.service.EmployeeImpl;

@Configuration
@ComponentScan(basePackages = "com.springCore.service")
public class AppConfig {
	
	@Bean
	public Employee getEmployee() {
		return new EmployeeImpl();
	}
}
