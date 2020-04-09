package com.springCore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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
