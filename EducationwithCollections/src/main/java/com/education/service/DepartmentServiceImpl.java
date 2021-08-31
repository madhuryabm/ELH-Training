package com.education.service;

import java.util.List;

import com.education.model.Department;
import com.education.model.Student;

public class DepartmentServiceImpl implements DepartmentService {

	public Student searchstudent(Department department, int searchId) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Student dummystudent = null;
		
		List<Student> studentList = department.getStudent();
		
		for (Student student : studentList) {
			
	       if (student.getStudentId() == searchId)
			{
				dummystudent = student;
			}
			else 
			{
				
			}
		}
		return dummystudent;
	
	}

}
