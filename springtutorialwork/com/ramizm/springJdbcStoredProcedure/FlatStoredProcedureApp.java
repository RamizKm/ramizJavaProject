package com.ramizm.springJdbcStoredProcedure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ramizm.springJdbcTemplate.StudentDAOImplHandler;

public class FlatStoredProcedureApp {
	
	public static String filename="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/springJdbcStoredProcedure/springJdbcStoredProcedure.xml";
	
	
	public static void main(String[] args) {
		System.out.println("FlatStoredProcedureApp.main() started...");
		
		ApplicationContext app=new FileSystemXmlApplicationContext(filename);
		FlatDAOImplHandler hrdo=(FlatDAOImplHandler)app.getBean("flatdaoimpl");
		System.out.println("FlatStoredProcedureApp.main() came to end");
		hrdo.getflatdetails("g6");
		hrdo.getListofFlats();
	}
/*
	FlatJdbcDO.FlatJdbcDO()
	Exception in thread "main" org.springframework.dao.InvalidDataAccessApiUsageException: Procedure or Function name is required
		at org.springframework.jdbc.core.simple.AbstractJdbcCall.compile(AbstractJdbcCall.java:267)
		at org.springframework.jdbc.core.simple.AbstractJdbcCall.checkCompiled(AbstractJdbcCall.java:333)
		at org.springframework.jdbc.core.simple.AbstractJdbcCall.doExecute(AbstractJdbcCall.java:348)*/
	
}
