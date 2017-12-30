package com.ramizm.springCustomEvent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class RamizCustomEventApp {

	public static String fileName="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/springCustomEvent/RamizcontextEvent.xml";

	public static void main(String[] args) {
		System.out.println("RamizCustomEventApp.main() filename="+fileName);
		/*//if file does not exist in claspath we get below eroror
		INFO: Loading XML bean definitions from class path resource [D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/springCustomEvent/RamizcontextEvent.xml]
		                                                             Exception in thread "main" org.springframework.beans.factory.BeanDefinitionStoreException: IOException parsing XML document from class path resource [D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/springCustomEvent/RamizcontextEvent.xml]; nested exception is java.io.FileNotFoundException: class path resource [D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/springCustomEvent/RamizcontextEvent.xml] cannot be opened because it does not exist
		                                                             	at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:341)
		                                                             	at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:302)
		                                                             	at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:174)
		                                                             	at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:209)*/
		ConfigurableApplicationContext config=new FileSystemXmlApplicationContext(fileName);
		CustomEventPublisher publisher=(CustomEventPublisher) config.getBean("cStartEventHandler");
		publisher.publish();
		publisher.publish();
		
		
	}
	
	
}
