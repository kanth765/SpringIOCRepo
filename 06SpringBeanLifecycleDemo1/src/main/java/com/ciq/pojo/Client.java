package com.ciq.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ExampleBean eb = context.getBean("ExampleBean", ExampleBean.class);
		System.out.println(eb);
	}
}
