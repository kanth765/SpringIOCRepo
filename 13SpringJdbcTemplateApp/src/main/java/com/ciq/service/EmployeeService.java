package com.ciq.service;

import java.util.List;

import com.ciq.pojo.Employee;

public interface EmployeeService {

	void save(Employee employee);

	List<Employee> getEmployees();
}
