package com.ramizm.setterBasedInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ramizm.protoTypScope.CompanyDo;

public class SetterInjectionApp {
	
	public static String filename="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/setterBasedInjection/SetterBasedInjection.xml";
	
	public static void main(String[] args) {
		System.out.println("SetterInjectionApp.main()");
		
		ApplicationContext app=new FileSystemXmlApplicationContext(filename);
		HospitalDO hrdo=(HospitalDO)app.getBean("ramizHelloworld");
			System.out.println("XmlBeanFactoryApp.checkXMlBean() hrdo="+hrdo);
			hrdo.getDoctorDetailsCheck();
		
		
	}
	/*DoctorsDO.DoctorsDO()
	HospitalDO.setDoctorContent()=com.ramizm.setterBasedInjection.DoctorsDO@76995893
	Exception in thread "main" java.lang.ClassCastException: com.ramizm.setterBasedInjection.HospitalDO cannot be cast to com.ramizm.setterBasedInjection.DoctorsDO
		at com.ramizm.setterBasedInjection.SetterInjectionApp.main(SetterInjectionApp.java:16)*/

}
