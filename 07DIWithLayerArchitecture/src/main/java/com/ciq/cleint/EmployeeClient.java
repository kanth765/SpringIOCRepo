package com.ciq.cleint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.EmployeeController;
import com.ciq.pojo.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "anil", 120000);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeController cont = (EmployeeController) context.getBean("controller");
		cont.save(employee);
	}

}
