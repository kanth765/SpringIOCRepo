package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.bean.Employee;

public class EmployeeClient {
	public static void main(String[] args) {
//		Employee employee=new Employee(1, "anil", 12000.00);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);

	}

}
