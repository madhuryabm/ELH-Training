package com.education.model;

public class University {

	private int Snno;
	private String uvName;
	private College[] college;

	public University() {
		super();
	}

	public University(int snno, String uvName) {
		super();
		Snno = snno;
		this.uvName = uvName;
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

	public College[] getCollege() {
		return college;
	}

	public void setCollege(College[] college) {
		this.college = college;
	}
	

}
