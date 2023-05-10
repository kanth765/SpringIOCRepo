package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.ciq.pojo.Employee;
import com.ciq.service.EmployeeServiceImpl;

@Controller("cts")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	public void save(Employee employee) {
		employeeServiceImpl.save(employee);
	}

	public int update(Employee employee) {
		System.out.println("controller..........");
		return employeeServiceImpl.update(employee);
	}

	public List<Employee> getEmployees() {
		return employeeServiceImpl.getEmployees();
	}

	public int delete(int id) {
		return employeeServiceImpl.delete(id);
	}

}
