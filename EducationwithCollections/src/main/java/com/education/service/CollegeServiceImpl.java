package com.education.service;

import java.util.List;

import com.education.model.College;

import com.education.model.Department;
import com.education.model.Student;

public class CollegeServiceImpl implements CollegeService {

	public Department SearchDepartment(College college, int departmentId) {
		// TODO Auto-generated method stub
		
	Department department = null;
		
		List<Department> departmentList = college.getDepartment();
		
		for (Department department2 : departmentList) {
			if (department2.getDepartmentId() == departmentId)
			{
				department = department2 ;
			}
			else 
			{
				
			}
			
		}
		
		return department;
		
		
		
	}

}
