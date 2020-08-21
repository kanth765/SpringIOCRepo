package com.vidvaan.student.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.vidvaan.student.bean.Student;

public class BeanFactoryContainer {
	public static void main(String[] args) {

//		Resource resource = new FileSystemResource("src/main/resources/spring.xml");
		Resource resource = new ClassPathResource("spring.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		Student student = (Student) factory.getBean("student");
		student.display();

	}

}
