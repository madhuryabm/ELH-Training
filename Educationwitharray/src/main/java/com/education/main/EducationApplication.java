package com.education.main;

import com.education.model.College;
import com.education.model.Department;
import com.education.model.Student;
import com.education.model.University;
import com.education.service.CollegeService;
import com.education.service.CollegeServiceImpl;
import com.education.service.DepartmentService;
import com.education.service.DepartmentServiceImpl;
import com.education.service.UniversityService;
import com.education.service.UniversitySeviceImpl;

public class EducationApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(123, "Anu", 24);
		Student student2 = new Student(456, "Manu", 34);
		Student student3 = new Student(789, "Sanu", 24);

		Department department = new Department();
		department.setDepartmentId(1234);
		department.setDepartmentName("maths");
		Student[] students = new Student[3];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;

		department.setStudent(students);

		DepartmentService departmentService = new DepartmentServiceImpl();
		Student student = departmentService.searchstudent(department, 123);
		if (student != null) {
			System.out.println(student.getStudentId());
			System.out.println(student.getStudentName());
			System.out.println(student.getAge());
		}

		Department department1 = new Department(1, "science", students);
		Department department2 = new Department(2, "Social", students);

		College college = new College();
		college.setCollegeId(45);
		college.setCollegeName("BMS College of Engineering");
		Department[] departments = new Department[2];
		departments[0] = department1;
		departments[1] = department2;

		college.setDepartment(departments);

		CollegeService collegeservice = new CollegeServiceImpl();
		Department departmen = collegeservice.SearchDepartment(college, 1);
		if (department != null) {
			System.out.println(departmen.getDepartmentId());
			System.out.println(departmen.getDepartmentName());
		}

		College college1 = new College(1, "B.M.S.College of Engineeering", departments);
		College college2 = new College(2, "Shree shivakumara swamiji college of engineering", departments);

		University university = new University();
		university.setSnno(134);
		university.setUvName("VTU");
		College[] colleges = new College[2];
		colleges[0] = college1;
		colleges[1] = college2;
		university.setCollege(colleges);
		UniversityService universityService = new UniversitySeviceImpl();
		College cllg = universityService.searchCollege(university, 1);
		if (college != null) {
			System.out.println(cllg.getCollegeId());
			System.out.println(cllg.getCollegeName());
			System.out.println(university.getUvName());
			System.out.println(university.getSnno());

		}

	}

}
