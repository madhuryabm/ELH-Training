package com.education.service;

import java.util.List;

import com.education.model.College;

import com.education.model.University;

public class UniversitySeviceImpl implements UniversityService {

	public College searchCollege(University university, int collegeId) {
		// TODO Auto-generated method stub
		
	College college= null;
		
		List<College> collegeList = university.getCollege();
		
		for (College college2 : collegeList) {
			
		
		
			if (college2.getCollegeId() == collegeId)
			{
				college = college2;
			}
			else 
			{
				
			}
			
		}
		return college;
		
		
		}
	}

