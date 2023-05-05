package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.pojo.Employee;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = (Employee) context.getBean("employee");
		Employee employee2 = context.getBean(Employee.class);
		Employee employee3 = context.getBean("employee", Employee.class);
		System.out.println(employee);
		System.out.println(employee2);
		System.out.println(employee3);

	}

}
