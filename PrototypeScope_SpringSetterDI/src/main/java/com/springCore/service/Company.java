package com.springCore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Spring is bydefault Singleton,If we want to change the scope then we can  change like this.

@Component
@Scope(value ="prototype")
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Company {
	
	private Department department;

	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public void showDepartmentInfo() {
		department.showDepartmentInfo();
	}
}
