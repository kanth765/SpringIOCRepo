package com.ciq.service;

import java.util.List;

import com.ciq.dao.EmployeeDaoImpl;
import com.ciq.pojo.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDaoImpl employeeDaoImpl;

	public EmployeeServiceImpl(EmployeeDaoImpl employeeDaoImpl) {
		this.employeeDaoImpl = employeeDaoImpl;
	}

//	public void setEmployeeDaoImpl(EmployeeDaoImpl employeeDaoImpl) {
//		this.employeeDaoImpl = employeeDaoImpl;
//	}

	public void save(Employee employee) {
		employeeDaoImpl.save(employee);

	}

	public List<Employee> getEmployees() {
		return employeeDaoImpl.getEmployees();
	}

}
