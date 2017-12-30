package com.ramizm.constructorBasedInjection;

public class StudentDO {
	
	public StudentDO()
	{
		System.out.println("StudentDO.StudentDO()");
	}
	
	public String studnetName;
	public String studnetId;
	public String getStudnetName() {
		System.out.println("StudentDO.getStudnetName()="+this.studnetName);
		return studnetName;
	}
	public void setStudnetName(String studnetName) {
		System.out.println("StudentDO.setStudnetName()="+this.studnetName);
		this.studnetName = studnetName;
	}
	public String getStudnetId() {
		System.out.println("StudentDO.getStudnetId()="+this.studnetId);
		return studnetId;
	}
	public void setStudnetId(String studnetId) {
		this.studnetId = studnetId;
	}

	
	public void getStudentDetails()
	{
		System.out.println("StudentDO.getStudentDetails() started. be patient.");
		System.out.println("StudentDO.getStudentDetails()");
		
		
		
	}
	
}
