package com.ciq.cleint;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.EmployeeController;
import com.ciq.pojo.Employee;

public class EmployeeClient {
// insert, update and delete
	// retrive
	public static void main(String[] args) {
		Employee employee = new Employee(4, "shamy", 32000);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeController cont = (EmployeeController) context.getBean("cts");
//		cont.save(employee);
//		cont.delete(5);
		List<Employee> employees = cont.getEmployees();
		employees.forEach(System.out::println);
	}

}
