package com.ciq.cleint;

import java.util.ArrayList;
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
//		cont.getProcedureCall(1);
//		System.out.println(byId.getId());
//		System.out.println(byId.getName());
//		System.out.println(byId.getSalary());
		Employee e1 = new Employee(1002, "radha", 22000);
		Employee e2 = new Employee(1003, "mohan", 33000);
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		cont.batchUpdate(employees);
	}

}
