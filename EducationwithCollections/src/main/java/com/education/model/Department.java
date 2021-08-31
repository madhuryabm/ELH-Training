package com.education.model;

import java.util.List;

public class Department {
	private int departmentId;
	private String departmentName;
	private List<Student> student;

	public Department() {
		super();
	}

	public Department(int departmentId, String departmentName, List<Student> student) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.student = student;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

}