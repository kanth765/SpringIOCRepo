package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.ciq.pojo.Employee;
import com.ciq.service.EmployeeServiceImpl;

//@Component("cts")
@Controller("cts")
public class EmployeeController {
//	EmployeeController employeeController=new EmployeeController();

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

//	
//
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
