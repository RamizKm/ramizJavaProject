package com.ramizm.injectingCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ramizm.protoTypScope.CompanyDo;

public class CollectionInjectionApp {
	
	
	public CollectionInjectionApp()
	{
		System.out.println("CollectionInjectionApp.CollectionInjectionApp()");
	}

	public static String filename="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/injectingCollection/CollectionMap.xml";
	
	private static String relPath="springtutorialwork/com/ramizm/injectingCollection/CollectionMap.xml";
	
	
	public static void main(String[] args) {
	System.out.println("CollectionInjectionApp.main() started.");
		ApplicationContext app=new FileSystemXmlApplicationContext(relPath);
		CollegeCollectionDO hrdo=(CollegeCollectionDO)app.getBean("ramizHelloworld");
		
	Object o=hrdo.getAssetMap();
	System.out.println("CollectionInjectionApp.main() map="+o);
		o=hrdo.getEmployeeList();
		System.out.println("CollectionInjectionApp.main() employee="+o);
		o=hrdo.getVendorSet();
		System.out.println("CollectionInjectionApp.main() vendor="+o);
		
	
	}
	
}
