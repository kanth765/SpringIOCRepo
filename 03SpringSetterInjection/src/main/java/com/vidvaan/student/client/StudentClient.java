package com.vidvaan.student.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidvaan.student.bean.Student;

public class StudentClient {

	public static void main(String[] args) {

//ioc container
//1. Beanfactory
//2. ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Student student = context.getBean("student", Student.class);
		Student student2 = context.getBean("student", Student.class);
		System.out.println(student.toString());
		System.out.println(student2.toString());
	}

}
