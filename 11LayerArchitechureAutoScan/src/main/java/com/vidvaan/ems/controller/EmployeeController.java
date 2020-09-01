package com.vidvaan.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.vidvaan.ems.bean.Employee;
import com.vidvaan.ems.service.EmployeeService;
import com.vidvaan.ems.service.EmployeeServiceImpl;

@Component("controller")
public class EmployeeController {
	
	//employeeController
 
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	  
	public void addEmp(Employee employee) {
		employeeServiceImpl.save(employee);
	}
}
