package com.education.service;

import com.education.model.College;

import com.education.model.Department;

public interface CollegeService {
	
	public abstract Department SearchDepartment(College college,int departmentId);

}
