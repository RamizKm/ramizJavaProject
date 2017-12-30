package com.ramizm.singleTonScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ramizm.springIocContainer.Filesystem.HelloworldDOxmlDO;


public class SingleTonApp {
	public static String filename="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/singleTonScope/BeanfileSingleTOn.xml";
/*	If scope is set to prototype, the Spring IoC container creates new bean instance of the object 
	every time a request for that specific bean is made. As a rule, use the prototype scope for all 
	state-full beans and the singleton(only one instance) scope for stateless beans.*/

	public static void main(String[] args) {
		System.out.println("SingleTonApp.main()");
		System.out.println("SingleTonApp.main()endded.");
		
		ApplicationContext app=new FileSystemXmlApplicationContext(filename);
		FlatDO hrdo=(FlatDO)app.getBean("ramizHelloworld");
			System.out.println("XmlBeanFactoryApp.checkXMlBean() hrdo="+hrdo);
				hrdo.setMsgId("ramiz momimn");
				hrdo.getMsgId();
				hrdo.setMsgId("kdkdkdkd");
				System.out.println("SingleTonApp.main( working with second)");
				FlatDO hrdo2=(FlatDO)app.getBean("ramizHelloworld");
				hrdo2.getMsgId();
				hrdo2.getMsgId();
				System.out.println("FilesystemApplicationApp.check()");
	}
	
}

