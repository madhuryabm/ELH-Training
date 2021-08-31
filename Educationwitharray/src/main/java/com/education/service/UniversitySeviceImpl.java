package com.education.service;

import com.education.model.College;

import com.education.model.University;

public class UniversitySeviceImpl implements UniversityService {

	public College searchCollege(University university, int collegeId) {
		// TODO Auto-generated method stub
		
	College college= null;
		
		College[] collegeArray = university.getCollege();
		
		for (int i = 0; i < collegeArray.length; i++)
		{
			if (collegeArray[i].getCollegeId() == collegeId)
			{
				college = collegeArray[i];
			}
			else 
			{
				
			}
		}
		return college;
		
	}

}
