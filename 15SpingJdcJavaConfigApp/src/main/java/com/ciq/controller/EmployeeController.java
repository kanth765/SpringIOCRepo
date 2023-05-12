package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.ciq.pojo.Employee;
import com.ciq.service.EmployeeServiceImpl;

public class EmployeeController {

	private EmployeeServiceImpl employeeServiceImpl;

	public void setEmployeeServiceImpl(EmployeeServiceImpl employeeServiceImpl) {
		this.employeeServiceImpl = employeeServiceImpl;
	}

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

	public List<Employee> findAllEmps() {
		return employeeServiceImpl.findAllEmps();
	}

	public List<Employee> getEmps() {
		return employeeServiceImpl.getEmps();
	}

	public Employee getById(int id) {
		return employeeServiceImpl.getById(id);
	}

	public void getProcedureCall(int id) {
		employeeServiceImpl.getProcedureCall(id);

	}

}