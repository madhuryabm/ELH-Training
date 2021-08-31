package com.education.model;

public class Student {
	private int studentId;
	private String studentName;
	private int Age;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int age) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.Age = age;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	

}
