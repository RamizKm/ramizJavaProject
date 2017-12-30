package com.ramizm.springIocContainer;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class XmlBeanFactoryApp {

	public static void main(String[] args) {
		System.out.println("XmlBeanFactoryApp.main() started......");
		checkXMlBean();
		
		
		
		
		
		
		
		
	}
	
	public static void checkXMlBean()
	{
		System.out.println("XmlBeanFactoryApp.checkXMlBean()");
	XmlBeanFactory bean=new XmlBeanFactory(new ClassPathResource("com/ramizm/springIocContainer/Bean.xml"));
	HelloWorldDo hrdo=(HelloWorldDo)bean.getBean("ramizHelloworld");
	System.out.println("XmlBeanFactoryApp.checkXMlBean() hrdo="+hrdo);
		
		hrdo.getMessage();
		
	}
	
	
}
