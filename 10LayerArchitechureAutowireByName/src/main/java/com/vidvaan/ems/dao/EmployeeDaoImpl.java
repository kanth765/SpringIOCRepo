package com.vidvaan.ems.dao;

import com.vidvaan.ems.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDAO {

	public void save(Employee employee) {
		System.out.println("employee dao is called");
		System.out.println(employee.toString());

	}

}
