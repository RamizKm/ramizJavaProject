package com.ramizm.springIocContainer.Filesystem;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.ramizm.springIocContainer.HelloWorldDo;

public class FilesystemApplicationApp {

	public static String filename="D:\\RAMIZ_WORK\\Spring_Tutorial_App\\src\\com\\ramizm\\springIocContainer\\Filesystem\\Beanfile.xml";
	
	public static void main(String[] args) {
		System.out.println("FilesystemApplicationApp.main()");
		check();
		
		
		
	}
	
	
	public static void check()
	{System.out.println("XmlBeanFactoryApp.checkXMlBean()");
	
ApplicationContext app=new FileSystemXmlApplicationContext(filename);
HelloworldDOxmlDO hrdo=(HelloworldDOxmlDO)app.getBean("ramizHelloworld");
	System.out.println("XmlBeanFactoryApp.checkXMlBean() hrdo="+hrdo);
		
		hrdo.getMessageId();
		System.out.println("FilesystemApplicationApp.check()");
	}
}
