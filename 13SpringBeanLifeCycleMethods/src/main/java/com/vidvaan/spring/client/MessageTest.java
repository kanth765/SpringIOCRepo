package com.vidvaan.spring.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidvaan.spring.bean.MessageBean;
import com.vidvaan.spring.bean.MessageBeans;

public class MessageTest {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		MessageBeans msgBean = (MessageBeans) context.getBean("message");
		msgBean.display();
		context.registerShutdownHook();
		context.close();
	}

}
