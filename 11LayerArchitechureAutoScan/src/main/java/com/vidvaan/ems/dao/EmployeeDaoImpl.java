package com.vidvaan.ems.dao;

import org.springframework.stereotype.Repository;

import com.vidvaan.ems.bean.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO {

	public void save(Employee employee) {
		System.out.println("employee dao is called");
		System.out.println(employee.toString());

	}

}
