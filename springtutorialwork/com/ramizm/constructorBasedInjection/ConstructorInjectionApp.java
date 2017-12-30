package com.ramizm.constructorBasedInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ramizm.protoTypScope.CompanyDo;

public class ConstructorInjectionApp {
	
	public static String filename="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/constructorBasedInjection/ConstructorInjection.xml";
	
	public ConstructorInjectionApp()
	{
		System.out.println("ConstructorInjectionApp.ConstructorInjectionApp() started.");
	}
	
//	D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/constructorBasedInjection/ConstructorInjection.xml
	public static void main(String[] args) {
		System.out.println("ConstructorInjectionApp.main()");
		
		ApplicationContext app=new FileSystemXmlApplicationContext(filename);
		CollegeDO hrdo=(CollegeDO)app.getBean("ramizHelloworld");
		hrdo.callBaseClass();
		System.out.println("ConstructorInjectionApp.main() endded.");
		
		
		
	}

}
