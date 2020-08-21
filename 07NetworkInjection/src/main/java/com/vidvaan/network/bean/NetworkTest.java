package com.vidvaan.network.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NetworkTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Samsung samsung = (Samsung) context.getBean("samsung");
		samsung.connectNetwork();
		
		Xoami xoami = (Xoami) context.getBean("redmi");
		xoami.connectNetwork();
	}

}
