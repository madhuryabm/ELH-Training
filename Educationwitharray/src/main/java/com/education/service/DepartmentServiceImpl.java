package com.education.service;

import com.education.model.Department;
import com.education.model.Student;

public class DepartmentServiceImpl implements DepartmentService {

	public Student searchstudent(Department department, int searchId) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Student dummystudent = null;
		
		Student[] studentArray = department.getStudent();
		
		for (int i = 0; i < studentArray.length; i++)
		{
			if (studentArray[i].getStudentId() == searchId)
			{
				dummystudent = studentArray[i];
			}
			else 
			{
				
			}
		}
		return dummystudent;
	
	}

}
