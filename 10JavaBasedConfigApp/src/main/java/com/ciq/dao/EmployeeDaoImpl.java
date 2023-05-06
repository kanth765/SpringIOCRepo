package com.ciq.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

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
