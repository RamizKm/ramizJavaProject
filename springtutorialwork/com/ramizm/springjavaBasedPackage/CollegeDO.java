package com.ramizm.springjavaBasedPackage;

public class CollegeDO {
	
	
	public String collegeId;
	public String collegeName;
	private CollegeDO(String collegeId, String collegeName) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
	}
	public String getCollegeId() {
		System.out.println("CollegeDO.getCollegeId()");
		return collegeId;
	}
	public void setCollegeId(String collegeId) {
		System.out.println("CollegeDO.setCollegeId()");
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		System.out.println("CollegeDO.getCollegeName()");
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		System.out.println("CollegeDO.setCollegeName()");
		this.collegeName = collegeName;
	}
public	CollegeDO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
