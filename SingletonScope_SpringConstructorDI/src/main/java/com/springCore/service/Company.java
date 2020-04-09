package com.springCore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Bydefault Spring is Singleton.No need to do any changes.If we want to do then do like this.

@Component
//@Scope("singleton")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Company {
	
	private Employee employee;
	
	@Autowired
	public Company(Employee employee) {
		this.employee=employee;
	}
	
	public void showEmployeeInfo() {
		employee.showEmployeeInfo();
	}
}
