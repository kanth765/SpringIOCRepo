package com.ciq.util;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import javax.naming.NamingException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mchange.v2.c3p0.jboss.C3P0PooledDataSource;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionPoolingDemo {

	public static void main(String[] args) throws SQLException, NamingException, PropertyVetoException {

		// apache common dbcp
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/ciqdb");
		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("root");
		System.out.println(basicDataSource);
		System.out.println(basicDataSource.getConnection());

		// spring jdbc
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/ciqdb");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		System.out.println(dataSource);
		System.out.println(dataSource.getConnection());

		// hikari
		HikariDataSource hikari = new HikariDataSource();
		hikari.setJdbcUrl("jdbc:mysql://localhost:3306/ciqdb");
		hikari.setDriverClassName("com.mysql.cj.jdbc.Driver");
		hikari.setUsername("root");
		hikari.setPassword("root");
		System.out.println(hikari);
		System.out.println(hikari.getConnection());

		// c3p0
		C3P0PooledDataSource c3pO = new C3P0PooledDataSource();
		c3pO.setJdbcUrl("jdbc:mysql://localhost:3306/ciqdb");
		c3pO.setDriverClass("com.mysql.cj.jdbc.Driver");
		c3pO.setUser("root");
		c3pO.setPassword("root");
		System.out.println(c3pO);
		System.out.println(c3pO.getConnectionTesterClassName());

	}

}
