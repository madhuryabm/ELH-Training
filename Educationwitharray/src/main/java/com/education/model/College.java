package com.education.model;

public class College {
	private int collegeId;
	private String CollegeName;
	private Department[] department;

	public College() {
		super();
	}

	public College(int collegeId, String collegeName, Department[] department) {
		super();
		this.collegeId = collegeId;
		CollegeName = collegeName;
		this.department = department;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return CollegeName;
	}

	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}

	public Department[] getDepartment() {
		return department;
	}

	public void setDepartment(Department[] department) {
		this.department = department;
	}

}
