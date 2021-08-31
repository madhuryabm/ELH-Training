package com.education.service;

import com.education.model.College;
import com.education.model.University;

public interface UniversityService {
	
	public abstract College searchCollege(University university , int collgeId);
	

}
