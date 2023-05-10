package com.ciq.service;

import java.util.List;

import com.ciq.pojo.Employee;

public interface EmployeeService {

	void save(Employee employee);

	List<Employee> getEmployees();

	int update(Employee employee);
	
	int delete(int id);
}
