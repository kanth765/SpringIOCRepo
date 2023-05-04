package com.ciq.client;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ciq.pojo.GreetingMessage;

public class BeanFactoryDemo {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		GreetingMessage message = (GreetingMessage) beanFactory.getBean("msg");
//		System.out.println(message);
		System.out.println(beanFactory.getBean("msg"));
		System.out.println(beanFactory.getBean("msg"));
		System.out.println(beanFactory.getBean("msg"));
		System.out.println(beanFactory.getBean("msg"));
		GreetingMessage msg2 = beanFactory.getBean(GreetingMessage.class);
//		System.out.println(beanFactory.getBean(GreetingMessage.class));
//		System.out.println(beanFactory.getBean(GreetingMessage.class));
//		System.out.println(beanFactory.getBean(GreetingMessage.class));
//		System.out.println(beanFactory.getBean(GreetingMessage.class));
//		System.out.println(msg2);
		System.out.println(beanFactory);
		GreetingMessage msg3 = (GreetingMessage) beanFactory.getBean("msg");
//		System.out.println(msg3);

		String[] aliases = beanFactory.getAliases("alias_msg1");
//		System.out.println(Arrays.toString(aliases));
	}

}
