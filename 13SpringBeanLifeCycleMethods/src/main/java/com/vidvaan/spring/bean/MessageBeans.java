package com.vidvaan.spring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MessageBeans {

	private String message;

	public MessageBeans(String message) {
		System.out.println("parameter bean");
		this.message = message;
	}

	public MessageBeans() {
		System.out.println("default bean");
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

	@PostConstruct
	public void startMessageBean() {
		System.out.println("MessageBean starting");

	}

	@PreDestroy
	public void endMessageBean() {
		System.out.println("MessageBean end");

	}

}
