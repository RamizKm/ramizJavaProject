package com.ramizm.aspectAnnotationProgrammin;

import java.io.InputStream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AnnotationAspectAppHandler {

	
	public AnnotationAspectAppHandler()
	{
		System.out.println("AnnotationAspectAppHandler.AnnotationAspectAppHandler()");
		System.out.println("AnnotationAspectAppHandler.AnnotationAspectAppHandler() this"+getClass().getName());
	}
	
	public static String fileName="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/aspectAnnotationProgrammin/aspectAnnotation.xml";
	
	
	public static void main(String[] args) {
		
		AnnotationAspectAppHandler ahr=new AnnotationAspectAppHandler();
		
		System.out.println("AnnotationAspectAppHandler.main()");
		System.out.println("AnnotationAspectAppHandler.main() filename="+fileName);
		
		InputStream io=ClassLoader.class.getResourceAsStream("/com/ramizm/aspectAnnotationProgrammin/aspectAnnotation.xml");
		
		System.out.println("AnnotationAspectAppHandler.main() io="+io);
		
		//load file from current directory relative path. same package so given direct file name
		//path name should be given from project directory path
		ApplicationContext ic=new FileSystemXmlApplicationContext("springtutorialwork/com/ramizm/aspectAnnotationProgrammin/aspectAnnotation.xml");
		System.out.println("AnnotationAspectAppHandler.main() ic="+ic);
		
		ApplicationContext appc=new ClassPathXmlApplicationContext("classpath:com/ramizm/aspectAnnotationProgrammin/aspectAnnotation.xml");
		//ApplicationContext ac=new filesystem
		
		
		
		System.out.println("AnnotationAspectAppHandler.main() appc="+appc);
		
		StroeDO st=(StroeDO) appc.getBean("storeStore");
		st.getStoreId();
		st.getStoreName();
		System.out.println("AnnotationAspectAppHandler.main() end...");
		
	}
}
