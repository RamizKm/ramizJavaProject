package com.ramizm.springInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ramizm.springBeanPostProcessor.BooKdo;

public class InheritanceApp {

	public static String filename="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/springInheritance/Inheritance.xml";

	public static void main(String[] args) {
		System.out.println("BeanPostProcessorApp.main()");
		ApplicationContext app=new FileSystemXmlApplicationContext(filename);
		BuildingInheritanceDO hrdo=(BuildingInheritanceDO)app.getBean("ramizHelloworld");
		hrdo.getBuildingId();
	
		//hrdo.
		
		FlatDoSun sunhr=(FlatDoSun)app.getBean("childinheritanceDO");
		sunhr.getBuildingId();
		sunhr.getFlatId();
		
		
	}
	
}
