package com.ciq.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ciq.pojo.Employee;

public class EmployeeResultsetExtractor implements ResultSetExtractor<List<Employee>> {

	@Override
	public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Employee> emps = new ArrayList<Employee>();

		while (rs.next()) {
			Employee employee = new Employee();
			employee.setId(rs.getInt(1));
			employee.setName(rs.getString(2));
			employee.setSalary(rs.getDouble(3));
			emps.add(employee);
		}
		return emps;
	}

}
