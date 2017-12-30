package com.ramizm.byTypeAutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ramizm.autowireByName.HotelDo;

public class AutoWireByApp {
	public static String filename="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/byTypeAutoWiring/autoWireByType.xml";

	private static String relPath="springtutorialwork/com/ramizm/byTypeAutoWiring/autoWireByType.xml";
	
	public static void main(String[] args) {
	
		
		System.out.println("AutoWireByApp.main()");
		ApplicationContext app=new FileSystemXmlApplicationContext(relPath);
		PersonDO hrdo=(PersonDO)app.getBean("ramizHelloworld");
		System.out.println("AutoWireByApp.main() calling parent function");
		hrdo.retrieveMobilePersonInfo();
	}
	//defautl constructor definition missing.
	/*
	Dec 15, 2013 10:15:01 PM org.springframework.beans.factory.support.DefaultListableBeanFactory destroySingletons
	INFO: Destroying singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@5ed2b042: defining beans [ramizHelloworld,ramizCustomerDo]; root of factory hierarchy
	Exception in thread "main" org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'ramizCustomerDo' defined in file [D:\RAMIZ_WORK\Spring_Tutorial_App\src\com\ramizm\byTypeAutoWiring\autoWireByType.xml]: Instantiation of bean failed; nested exception is org.springframework.beans.BeanInstantiationException: Could not instantiate bean class [com.ramizm.byTypeAutoWiring.MobileDo]: No default constructor found; nested exception is java.lang.NoSuchMethodException: com.ramizm.byTypeAutoWiring.MobileDo.<init>()
		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateBean(AbstractAutowireCapableBeanFactory.java:1007)
		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:953)
		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:487)
		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:458)
		at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:295)
		at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:223)
		at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:292)
		at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:194)
		at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:626)
		at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:932)
		at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:479)
		at org.springframework.context.support.FileSystemXmlApplicationContext.<init>(FileSystemXmlApplicationContext.java:140)
		at org.springframework.context.support.FileSystemXmlApplicationContext.<init>(FileSystemXmlApplicationContext.java:84)
		at com.ramizm.byTypeAutoWiring.AutoWireByApp.main(AutoWireByApp.java:13)
	Caused by: org.springframework.beans.BeanInstantiationException: Could not instantiate bean class [com.ramizm.byTypeAutoWiring.MobileDo]: No default constructor found; nested exception is java.lang.NoSuchMethodException: com.ramizm.byTypeAutoWiring.MobileDo.<init>()
		at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:83)
		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateBean(AbstractAutowireCapableBeanFactory.java:1000)
		... 13 more
	Caused by: java.lang.NoSuchMethodException: com.ramizm.byTypeAutoWiring.MobileDo.<init>()
		at java.lang.Class.getConstructor0(Class.java:2730)
		at java.lang.Class.getDeclaredConstructor(Class.java:2004)
		at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:78)*/

}
