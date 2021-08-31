package com.education.service;

import com.education.model.College;

import com.education.model.Department;
import com.education.model.Student;

public class CollegeServiceImpl implements CollegeService {

	public Department SearchDepartment(College college, int departmentId) {
		// TODO Auto-generated method stub
		
	Department department = null;
		
		Department[] departmentArray = college.getDepartment();
		
		for (int i = 0; i < departmentArray.length; i++)
		{
			if (departmentArray[i].getDepartmentId() == departmentId)
			{
				department = departmentArray[i];
			}
			else 
			{
				
			}
		}
		return department;
		
		
		
	}

}
