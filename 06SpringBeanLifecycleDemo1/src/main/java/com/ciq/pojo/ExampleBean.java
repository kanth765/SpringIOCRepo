package com.ciq.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ExampleBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {

	private int id;
	private String name;

	public ExampleBean() {
		System.out.println("ExampleBean default constructor....");
	}

	public ExampleBean(int id, String name) {
		System.out.println("ExampleBean parameterized constructor....");
		this.id = id;
		this.name = name;
	}

	public void setBeanName(String name) {
		this.name = "ExampleBean";
		System.out.println("bean name aware " + name);

	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("bean factory aware " + beanFactory.isSingleton("ExampleBean"));

	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext aware " + applicationContext.isPrototype("ExampleBean"));

	}

	public void afterPropertiesSet() throws Exception {
		this.name = "ExampleBean";
		System.out.println("afterPropertiesSet " + name);

		
	}

}
