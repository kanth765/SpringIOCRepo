package com.ciq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ciq.pojo.Employee;
import com.ciq.tempalte.CiqTemplate;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private CiqTemplate ciqTemplate;

//	@Autowired
//	private DataSource dataSource;

//	Connection connections = getConnections();
//	try {
//		PreparedStatement ps = connections.prepareStatement("insert into employee values(?,?,?)");
//		ps.setInt(1, employee.getId());
//		ps.setString(2, employee.getName());
//		ps.setDouble(3, employee.getSalary());
//		int result = ps.executeUpdate();
//		System.out.println(result);
//
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}

	public void save(Employee employee) {
		int result = ciqTemplate.update("insert into employee values(?,?,?)",
				new Object[] { employee.getId(), employee.getName(), employee.getSalary() });
		System.out.println(result);
	}

	public List<Employee> getEmployees() {
		System.out.println("list of employees ");
		return null;
	}

//	private static Connection getConnections() {
//		BasicDataSource basicDataSource = new BasicDataSource();
//		basicDataSource.setUrl("jdbc:mysql://localhost:3306/ciqdb");
//		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		basicDataSource.setUsername("root");
//		basicDataSource.setPassword("root");
//		Connection connection = null;
//		try {
//			connection = basicDataSource.getConnection();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return connection;
//	}

}
