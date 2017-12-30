package com.ramizm.springBeanPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ramizm.singleTonScope.FlatDO;

public class BeanPostProcessorApp {
	public static String filename="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/springBeanPostProcessor/BeanPostProcessor.xml";
	
	
	public static void main(String[] args) {
		System.out.println("BeanPostProcessorApp.main()");
		ApplicationContext app=new FileSystemXmlApplicationContext(filename);
		BooKdo hrdo=(BooKdo)app.getBean("ramizHelloworld");
		hrdo.getBookId();
		
	}
}
