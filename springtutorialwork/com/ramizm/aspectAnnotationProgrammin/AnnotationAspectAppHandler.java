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

/*
INFO: Refreshing org.springframework.context.support.FileSystemXmlApplicationContext@6e3d60: startup date [Sat Jan 06 22:41:35 IST 2018]; root of context hierarchy
6 Jan, 2018 10:41:35 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFO: Loading XML bean definitions from file [R:\ramiz_git_work\ramizJavaProject\ramizJavaProject\springtutorialwork\com\ramizm\aspectAnnotationProgrammin\aspectAnnotation.xml]
Exception in thread "main" org.springframework.beans.factory.parsing.BeanDefinitionParsingException: Configuration problem: Unable to locate Spring NamespaceHandler for XML schema namespace [http://www.springframework.org/schema/aop]
Offending resource: file [R:\ramiz_git_work\ramizJavaProject\ramizJavaProject\springtutorialwork\com\ramizm\aspectAnnotationProgrammin\aspectAnnotation.xml]

	at org.springframework.beans.factory.parsing.FailFastProblemReporter.error(FailFastProblemReporter.java:70)
	at org.springframework.beans.factory.parsing.ReaderContext.error(ReaderContext.java:85)
	at org.springframework.beans.factory.parsing.ReaderContext.error(ReaderContext.java:80)
	at org.springframework.beans.factory.xml.BeanDefinitionParserDelegate.error(BeanDefinitionParserDelegate.java:301)
	at org.springframework.beans.factory.xml.BeanDefinitionParserDelegate.parseCustomElement(BeanDefinitionParserDelegate.java:1408)
	at org.springframework.beans.factory.xml.BeanDefinitionParserDelegate.parseCustomElement(BeanDefinitionParserDelegate.java:1401)
	at org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader.parseBeanDefinitions(DefaultBeanDefinitionDocumentReader.java:168)
	at org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader.doRegisterBeanDefinitions(DefaultBeanDefinitionDocumentReader.java:138)
	at org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader.registerBeanDefinitions(DefaultBeanDefinitionDocumentReader.java:94)
	at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.registerBeanDefinitions(XmlBeanDefinitionReader.java:508)
	at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.doLoadBeanDefinitions(XmlBeanDefinitionReader.java:392)
	at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:336)
	at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:304)
	


*/