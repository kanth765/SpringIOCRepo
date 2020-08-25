package com.vidvaan.ems.controller;

import com.vidvaan.ems.bean.Employee;
import com.vidvaan.ems.service.EmployeeService;
import com.vidvaan.ems.service.EmployeeServiceImpl;

public class EmployeeController {

//	private EmployeeService service  = new EmployeeServiceImpl();

	private EmployeeServiceImpl employeeServiceImpl;

	 
 

	public void setEmployeeServiceImpl(EmployeeServiceImpl employeeServiceImpl) {
		this.employeeServiceImpl = employeeServiceImpl;
	}




	public void addEmp(Employee employee) {
		employeeServiceImpl.save(employee);
	}
}
