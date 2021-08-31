package com.education.service;

import com.education.model.Department;
import com.education.model.Student;

public interface DepartmentService {
	public abstract Student searchstudent(Department department,int searchId);

}
