package com.ciq.dao;

import java.util.List;

import com.ciq.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	public void save(Employee employee) {
		System.out.println("employee save...." + employee);

	}

	public List<Employee> getEmployees() {
		System.out.println("list of employees ");
		return null;
	}

}
