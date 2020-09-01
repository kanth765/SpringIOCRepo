package com.vidvaan.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MessageBean implements InitializingBean, DisposableBean, BeanNameAware, ApplicationContextAware {

	private String message;

	public MessageBean() {
		System.out.println("default bean");
	}

	public MessageBean(String message) {
		System.out.println("parameter bean");
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void display() {
		System.out.println(" MessageBean Display Method:  " + message);
	}

	public void startMessageBean() {
		System.out.println("MessageBean starting");

	}

	public void endMessageBean() {
		System.out.println("MessageBean end");

	}

	public void afterPropertiesSet() throws Exception {
		// it is a init method
		System.out.println("MessageBean init method");

	}

	public void destroy() throws Exception {
		System.out.println("MessageBean  destroy");

	}

	public void setBeanName(String name) {
		System.out.println("what is the message bean name: " + name);
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("spring ioc container: " + applicationContext);
	}

}
