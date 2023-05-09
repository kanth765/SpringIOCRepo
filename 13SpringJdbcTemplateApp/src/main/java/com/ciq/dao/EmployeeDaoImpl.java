package com.ciq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.pojo.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save(Employee employee) {
		int result = jdbcTemplate.update("insert into employee values(?,?,?)",
				new Object[] { employee.getId(), employee.getName(), employee.getSalary() });
		System.out.println(result);
	}

	public List<Employee> getEmployees() {
		System.out.println("list of employees ");
		return null;
	}

}
