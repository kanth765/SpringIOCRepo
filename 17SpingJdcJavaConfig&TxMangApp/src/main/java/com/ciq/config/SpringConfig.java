package com.ciq.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ciq.controller.EmployeeController;
import com.ciq.dao.EmployeeDaoImpl;
import com.ciq.service.EmployeeServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.ciq.*")
@PropertySource("classpath:db.properties")
@EnableTransactionManagement(proxyTargetClass = true)
public class SpringConfig {

	{
		System.out.println("spring config....");
	}

	@Autowired
	private Environment environment;

	@Bean
	public DataSource getDataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl(environment.getProperty("url"));
		basicDataSource.setDriverClassName(environment.getProperty("driver"));
		basicDataSource.setUsername(environment.getProperty("username"));
		basicDataSource.setPassword(environment.getProperty("password"));
		System.out.println(basicDataSource);
		return basicDataSource;
	}

	@Bean
	public EmployeeController getController() {
		EmployeeController controller = new EmployeeController();
		controller.setEmployeeServiceImpl(getService());
		return controller;
	}

	@Bean
	public EmployeeServiceImpl getService() {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		service.setEmployeeDaoImpl(getDao());
		return service;
	}

	@Bean
	public EmployeeDaoImpl getDao() {
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
//		dao.setJdbcTemplate(getTemplate());
		return dao;
	}

	@Bean
	public JdbcTemplate getTemplate() {
		return new JdbcTemplate(getDataSource());
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(getDataSource());
		return transactionManager;
	}

}
