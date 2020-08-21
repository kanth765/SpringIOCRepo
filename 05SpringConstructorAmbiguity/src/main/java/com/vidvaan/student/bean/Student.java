package com.vidvaan.student.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

//Student is dependent
public class Student {

	// dependency
	private int sid = 1;
	private String name = "none";
	private double fee = 0.0;
	private String course = "java";
//	private List<String> contacts;
//	private Set<String> address;
//	private Map<String, String> course;

	public Student(int sid, String name) {
		System.out.println("Student(int sid, String name)");
		this.sid = sid;
		this.name = name;
	}

	public Student(double fee, String course) {
		System.out.println(" Student(double fee, String course)");
		this.fee = fee;
		this.course = course;
	}

	public Student(int sid, String name, double fee, String course) {
		System.out.println(" Student(parameter course)");
		this.sid = sid;
		this.name = name;
		this.fee = fee;
		this.course = course;
	}

	public void display() {
		System.out.println("StudentId: " + sid);
		System.out.println("Studentname: " + name);
		System.out.println("Studentfee: " + fee);
		System.out.println("Studentcourse: " + course);
	}

}
