package com.ciq.controller;

import java.util.List;

import com.ciq.pojo.Employee;
import com.ciq.service.EmployeeServiceImpl;

public class EmployeeController {

	private EmployeeServiceImpl employeeServiceImpl;

	public EmployeeController(EmployeeServiceImpl employeeServiceImpl) {
		this.employeeServiceImpl = employeeServiceImpl;
	}

//	public void setEmployeeServiceImpl(EmployeeServiceImpl employeeServiceImpl) {
//		this.employeeServiceImpl = employeeServiceImpl;
//	}

	public void save(Employee employee) {
		employeeServiceImpl.save(employee);
	}

	public List<Employee> getEmployees() {
		return employeeServiceImpl.getEmployees();
	}

}
