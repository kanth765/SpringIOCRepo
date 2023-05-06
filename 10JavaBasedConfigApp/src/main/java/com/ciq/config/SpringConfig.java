package com.ciq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ciq.dao.EmployeeDaoImpl;
import com.ciq.service.EmployeeServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.ciq.*")
public class SpringConfig {

	@Bean
	public EmployeeDaoImpl dao() {
		return new EmployeeDaoImpl();
	}

	@Bean
	public EmployeeServiceImpl service() {
		return new EmployeeServiceImpl();
	}

}
