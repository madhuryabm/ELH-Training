package com.education.model;

import java.util.List;

public class University {

	private int Snno;
	private String uvName;
	private List<College> college;

	public University() {
		super();
	}

	public University(int snno, String uvName, List<College> college) {
		super();
		Snno = snno;
		this.uvName = uvName;
		this.college = college;
	}

	public int getSnno() {
		return Snno;
	}

	public void setSnno(int snno) {
		Snno = snno;
	}

	public String getUvName() {
		return uvName;
	}

	public void setUvName(String uvName) {
		this.uvName = uvName;
	}

	public List<College> getCollege() {
		return college;
	}

	public void setCollege(List<College> college) {
		this.college = college;
	}

}