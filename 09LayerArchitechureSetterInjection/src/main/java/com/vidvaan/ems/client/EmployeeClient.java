package com.vidvaan.ems.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidvaan.ems.bean.Employee;
import com.vidvaan.ems.controller.EmployeeController;

public class EmployeeClient {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeController controller = (EmployeeController) context.getBean("controller");
		controller.addEmp(new Employee(1000, "Anil"));

	}

}
