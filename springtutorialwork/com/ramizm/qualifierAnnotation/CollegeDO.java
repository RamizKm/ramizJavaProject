package com.ramizm.qualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CollegeDO {

	@Autowired
	@Qualifier("studentDO")
	public StudentQualifierDO studentContent;

	public void printStudentDeytails()
	//if you initailizse for each instance ,it will give null values for each member.Be specific to set for each value.
	{if(studentContent==null)
		studentContent=new StudentQualifierDO();
		studentContent.getStudentName();
		studentContent.getStudnetId();
	}
	
	
	
}
