package com.ramizm.constructorBasedInjection;

public class CollegeDO {
	
	public StudentDO studentContent;

	public CollegeDO(StudentDO studentContent) {
		super();
		this.studentContent = studentContent;
		System.out.println("CollegeDO.CollegeDO() in argument constructor call is being done. call");
	}

	public CollegeDO() {
		super();
		System.out.println("CollegeDO.CollegeDO() super consturtoro called.");
		// TODO Auto-generated constructor stub
	}
	
	public void callBaseClass()
	{
		System.out.println("CollegeDO.callBaseClass() calling subclass");
		studentContent.getStudentDetails();
		System.out.println("CollegeDO.callBaseClass() after calling student details.....");
		
	}
	
	

}
