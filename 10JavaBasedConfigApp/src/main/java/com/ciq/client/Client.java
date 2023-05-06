package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciq.config.SpringConfig;
import com.ciq.pojo.Employee;
import com.ciq.service.EmployeeServiceImpl;

public class Client {
	// give me 5 minutes.....
	public static void main(String[] args) {
		Employee employee = new Employee(1, "ram", 1220000);
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		EmployeeServiceImpl service = context.getBean(EmployeeServiceImpl.class);
		service.save(employee);
	}

}
