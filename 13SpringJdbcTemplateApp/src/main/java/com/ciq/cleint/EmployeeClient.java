package com.ciq.cleint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.EmployeeController;
import com.ciq.pojo.Employee;

public class EmployeeClient {
// insert, update and delete
	// retrive
	public static void main(String[] args) {
		Employee employee = new Employee(5003, "anil", 120000);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeController cont = (EmployeeController) context.getBean("cts");
		cont.save(employee);
	}

}
