package com.ciq.dao;

import java.util.List;

import com.ciq.pojo.Employee;

public interface EmployeeDao {

	void save(Employee employee);

	int update(Employee employee);

	int delete(int id);

	Employee getByID(int id);

	List<Employee> getEmployees();

	List<Employee> findAllEmps();

	List<Employee> getEmps();

}
