package com.ciq.cleint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.EmployeeController;
import com.ciq.pojo.Employee;

public class EmployeeClient {
// insert, update and delete
	// retrive
	public static void main(String[] args) {
		Employee e1 = new Employee(1002, "radhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 22000);
		Employee e2 = new Employee(1003, "mohan", 33000);
//		Employee e3 = new Employee(15, "shamy", 32000);

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeController cont = (EmployeeController) context.getBean("cts");
//		cont.save(employee);
//		cont.delete(5);
//		List<Employee> employees = cont.getEmps();
//		employees.forEach(System.out::println);
//		Employee byId = cont.getById(13);
//		System.out.println(byId.getId());
//		System.out.println(byId.getName());
//		System.out.println(byId.getSalary());

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		cont.batchUpdate(employees);

	}

}
