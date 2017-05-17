package com.divya.pojos;

public class Student {
	private int studId;
	private String studName;
	private String course;
	
	public Student(){}
	
	public Student(int studId, String studName, String course) {
		this.studId = studId;
		this.studName = studName;
		this.course = course;
	}



	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName
				+ ", course=" + course + "]";
	}
	
	
}
