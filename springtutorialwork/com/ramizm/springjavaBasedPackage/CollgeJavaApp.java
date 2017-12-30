package com.ramizm.springjavaBasedPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollgeJavaApp {
	
	public static void main(String[] args) {
		System.out.println("CollgeJavaApp.main()");
		ApplicationContext ctx=new AnnotationConfigApplicationContext(CollegeDO.class);
		CollegeDO hrs=ctx.getBean(CollegeDO.class);
		hrs.setCollegeId("445");
		hrs.setCollegeName("vjti mumbai");
		
	}

}
