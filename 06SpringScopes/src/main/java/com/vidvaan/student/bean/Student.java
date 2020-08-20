package com.vidvaan.student.bean;

//Student is dependent
public class Student {

	//dependency
	private int sid;
	private String name;

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
