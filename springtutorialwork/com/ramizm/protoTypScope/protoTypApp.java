package com.ramizm.protoTypScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ramizm.singleTonScope.FlatDO;

public class protoTypApp {

	public static String filename="D://RAMIZ_WORK//Spring_Tutorial_App/src/com/ramizm/protoTypScope/Prtototype.xml";
	
	public static void main(String[] args) {
		System.out.println("protoTypApp.main()");
		
		ApplicationContext app=new FileSystemXmlApplicationContext(filename);
		CompanyDo hrdo=(CompanyDo)app.getBean("ramizHelloworld");
			System.out.println("XmlBeanFactoryApp.checkXMlBean() hrdo="+hrdo);
				hrdo.getCompanyName();//("ramiz momimn");
				hrdo.setCompanyName("ramiz");
				System.out.println("protoTypApp.main() second check---------------------------------------");
				CompanyDo hrdo2=(CompanyDo)app.getBean("ramizHelloworld");
				System.out.println("XmlBeanFactoryApp.checkXMlBean() hrdo="+hrdo2);
					hrdo2.getCompanyName();//("ramiz momimn");
		
		
		
	}
	
}
