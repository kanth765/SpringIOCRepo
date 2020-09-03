package com.vidvaan.ioc.bean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseConnection {
	
	public static void main(String[] args) {
		ApplicationContext appletContext = new ClassPathXmlApplicationContext("spring.xml");
		
		ConnectionUtil connectionUtil = (ConnectionUtil) appletContext.getBean("util");
		connectionUtil.getConnection();
	}

}
