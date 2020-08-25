package com.vidvaan.ems.service;

import com.vidvaan.ems.bean.Employee;
import com.vidvaan.ems.dao.EmployeeDAO;
import com.vidvaan.ems.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {


	private EmployeeDaoImpl employeeDaoImpl;

	public void setEmployeeDaoImpl(EmployeeDaoImpl employeeDaoImpl) {
		this.employeeDaoImpl = employeeDaoImpl;
	}

	public void save(Employee employee) {
		System.out.println("employee service called");
		employeeDaoImpl.save(employee);
	}

}
