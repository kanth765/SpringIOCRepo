package com.vidvaan.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.vidvaan.ems.bean.Employee;
import com.vidvaan.ems.dao.EmployeeDAO;
import com.vidvaan.ems.dao.EmployeeDaoImpl;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDaoImpl employeeDaoImpl;

	public void save(Employee employee) {
		System.out.println("employee service called");
		employeeDaoImpl.save(employee);
	}

}
