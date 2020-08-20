package com.vidvaan.student.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

//Student is dependent
public class Student {

	// dependency
	private int sid;
	private String name;
//	private List<String> contacts;
//	private Set<String> address;
//	private Map<String, String> course;

	public Student(int sid, String name) {
		System.out.println("Student(int sid, String name)");
		this.sid = sid;
		this.name = name;
	}

	public Student(String sid, String name) {
		System.out.println("Student(String sid, String name)");
		this.sid = Integer.parseInt(sid);
		this.name = name;
	}

	public void display() {
		System.out.println("StudentId: " + sid + " StudentName: " + name);
	}

}
