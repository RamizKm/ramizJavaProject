package com.ramizm.qualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ramizm.injectingCollection.CollegeCollectionDO;

public class QualifierStudentApp {
	
	public static String filename="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/qualifierAnnotation/Qualifier_Annotation.xml";

	public static void main(String[] args) {
		System.out.println("CollectionInjectionApp.main() started.");
		ApplicationContext app=new FileSystemXmlApplicationContext(filename);
		CollegeDO hrdo=(CollegeDO)app.getBean("ramizHelloworld");
		hrdo.printStudentDeytails();
		
	}

}
