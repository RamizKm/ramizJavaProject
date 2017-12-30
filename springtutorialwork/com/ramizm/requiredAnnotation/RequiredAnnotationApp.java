package com.ramizm.requiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ramizm.setterBasedInjection.HospitalDO;

public class RequiredAnnotationApp {
	public static String filename="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/requiredAnnotation/requiredAnnotation.xml";
	
	public RequiredAnnotationApp()
	{
		System.out.println("RequiredAnnotationApp.RequiredAnnotationApp()");
	}

	public static void main(String[] args) {
	try{
		System.out.println("RequiredAnnotationApp.main() started...");
		ApplicationContext app=new FileSystemXmlApplicationContext(filename);
		TransportCompanyDO hrdo=(TransportCompanyDO)app.getBean("ramizHelloworld");
		hrdo.getTranportName();
		hrdo.getTransportId();
		System.out.println("RequiredAnnotationApp.main() inside tr");
	}catch (Exception e) {
		// TODO: handle exception
	e.printStackTrace();
	System.out.println("RequiredAnnotationApp.main()e ");
	}
		
	}
	//setter method missing.
//	INFO: Refreshing org.springframework.context.support.FileSystemXmlApplicationContext@45858aa4: startup date [Mon Dec 16 00:09:48 IST 2013]; root of context hierarchy
//	Dec 16, 2013 12:09:48 AM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
//	INFO: Loading XML bean definitions from file [D:\RAMIZ_WORK\Spring_Tutorial_App\src\com\ramizm\requiredAnnotation\requiredAnnotation.xml]
//	Dec 16, 2013 12:09:49 AM org.springframework.beans.factory.support.DefaultListableBeanFactory preInstantiateSingletons
//	INFO: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@1be48a7: defining beans [ramizHelloworld,ramizCustomerDo]; root of factory hierarchy
//	BusInformationDo.BusInformationDo() default construtsor
//	Exception in thread "main" org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'ramizHelloworld' defined in file [D:\RAMIZ_WORK\Spring_Tutorial_App\src\com\ramizm\requiredAnnotation\requiredAnnotation.xml]: Error setting property values; nested exception is org.springframework.beans.NotWritablePropertyException: Invalid property 'tranportName' of bean class [com.ramizm.requiredAnnotation.TransportCompanyDO]: Bean property 'tranportName' is not writable or has an invalid setter method. Does the parameter type of the setter match the return type of the getter?
//		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1423)
//		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1128)
//		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:519)
//		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:458)
//		at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:314)
//		at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:194)
	
	//required annotation 
/*	NFO: Loading XML bean definitions from file [D:\RAMIZ_WORK\Spring_Tutorial_App\src\com\ramizm\requiredAnnotation\requiredAnnotation.xml]
	                                             Dec 16, 2013 12:16:26 AM org.springframework.beans.factory.support.DefaultListableBeanFactory preInstantiateSingletons
	                                             INFO: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@48ee6315: defining beans [org.springframework.context.annotation.internalConfigurationAnnotationProcessor,org.springframework.context.annotation.internalAutowiredAnnotationProcessor,org.springframework.context.annotation.internalRequiredAnnotationProcessor,org.springframework.context.annotation.internalCommonAnnotationProcessor,ramizHelloworld,ramizCustomerDo,org.springframework.context.annotation.ConfigurationClassPostProcessor.importAwareProcessor]; root of factory hierarchy
	                                             BusInformationDo.BusInformationDo() default construtsor
	                                             org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'ramizHelloworld' defined in file [D:\RAMIZ_WORK\Spring_Tutorial_App\src\com\ramizm\requiredAnnotation\requiredAnnotation.xml]: Initialization of bean failed; nested exception is org.springframework.beans.factory.BeanInitializationException: Property 'transportId' is required for bean 'ramizHelloworld'
	                                             	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:529)
	                                             	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:458)
	                                             	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:314)
	                                             	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:194)
	                                             	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1117)
	                                             	at com.ramizm.requiredAnnotation.RequiredAnnotationApp.main(RequiredAnnotationApp.java:20)
	                                             Caused by: org.springframework.beans.factory.BeanInitializationException: Property 'transportId' is required for bean 'ramizHelloworld'
	                                             	at org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor.postProcessPropertyValues(RequiredAnnotationBeanPostProcessor.java:151)
	                                             	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1116)
	                                             	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:519)
	                                             	... 5 more
	                                             RequiredAnnotationApp.main()e */

	
}


/*Dec 16, 2013 10:27:44 PM org.springframework.context.support.FileSystemXmlApplicationContext prepareRefresh
INFO: Refreshing org.springframework.context.support.FileSystemXmlApplicationContext@783f472b: startup date [Mon Dec 16 22:27:44 IST 2013]; root of context hierarchy
Dec 16, 2013 10:27:44 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFO: Loading XML bean definitions from file [D:\RAMIZ_WORK\Spring_Tutorial_App\src\com\ramizm\requiredAnnotation\requiredAnnotation.xml]
Dec 16, 2013 10:27:45 PM org.springframework.beans.factory.support.DefaultListableBeanFactory preInstantiateSingletons
INFO: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@48ee6315: defining beans [org.springframework.context.annotation.internalConfigurationAnnotationProcessor,org.springframework.context.annotation.internalAutowiredAnnotationProcessor,org.springframework.context.annotation.internalRequiredAnnotationProcessor,org.springframework.context.annotation.internalCommonAnnotationProcessor,ramizHelloworld,ramizCustomerDo,org.springframework.context.annotation.ConfigurationClassPostProcessor.importAwareProcessor]; root of factory hierarchy
BusInformationDo.BusInformationDo() default construtsor
org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'ramizHelloworld' defined in file [D:\RAMIZ_WORK\Spring_Tutorial_App\src\com\ramizm\requiredAnnotation\requiredAnnotation.xml]: Initialization of bean failed; nested exception is org.springframework.beans.factory.BeanInitializationException: Property 'transportId' is required for bean 'ramizHelloworld'
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:529)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:458)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:314)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:194)
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1117)
	at com.ramizm.requiredAnnotation.RequiredAnnotationApp.main(RequiredAnnotationApp.java:20)
Caused by: org.springframework.beans.factory.BeanInitializationException: Property 'transportId' is required for bean 'ramizHelloworld'
	at org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor.postProcessPropertyValues(RequiredAnnotationBeanPostProcessor.java:151)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1116)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:519)
	... 5 more
RequiredAnnotationApp.main()e 
*/

