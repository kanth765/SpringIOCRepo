package com.ciq.cleint;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.config.SpringConfig;
import com.ciq.controller.EmployeeController;
import com.ciq.pojo.Employee;

public class EmployeeClient {
// insert, update and delete
	// retrive
	public static void main(String[] args) {
		Employee employee = new Employee(4, "shamy", 32000);
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		EmployeeController cont = context.getBean(EmployeeController.class);
//		cont.save(employee);
//		cont.delete(5);
//		List<Employee> employees = cont.getEmps();
//		employees.forEach(System.out::println);
		 cont.getProcedureCall(1);
//		System.out.println(byId.getId());
//		System.out.println(byId.getName());
//		System.out.println(byId.getSalary());
	}

}
