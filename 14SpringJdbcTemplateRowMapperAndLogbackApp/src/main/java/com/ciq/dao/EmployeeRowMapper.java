package com.ciq.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import com.ciq.pojo.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	private static Logger LOGS = LoggerFactory.getLogger(EmployeeRowMapper.class);

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setId(rs.getInt(1));
		employee.setName(rs.getString(2));
		employee.setSalary(rs.getDouble(3));
		LOGS.debug("emp row mapper execution.........");
		return employee;

	}

}
