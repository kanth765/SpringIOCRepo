package com.ciq.dao;

import java.util.List;

import com.ciq.pojo.Employee;

public interface EmployeeDao {

	void save(Employee employee);

	List<Employee> getEmployees();

}
