package com.spring.beans;

public class SpringSchoolBean {
	
	public SpringSchoolBean() {
		System.out.println("SpringSchoolBean.SpringSchoolBean()");
	}
	
	private String medium;
	private String name;
	private String intake;
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntake() {
		return intake;
	}
	public void setIntake(String intake) {
		this.intake = intake;
	}
	

}
