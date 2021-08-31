package com.education.model;

public class Department {
	private int departmentId;
	private String departmentName;
	private Student[] student;

	public Department(int departmentId, String departmentName, Student[] student) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.student = student;
	}

	public Department() {
		super();
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

	public Student[] getStudent() {
		return student;
	}

	public void setStudent(Student[] student) {
		this.student = student;
	}


}
