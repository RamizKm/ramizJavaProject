package com.ramizm.autowireByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ramizm.constructorBasedInjection.CollegeDO;

public class HotelCustomerApp {
	
	public static String filename="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/autowireByName/autoWireByName.xml";
	
	public static void mainfff(String[] args) {
		System.out.println("ConstructorInjectionApp.main()");
		
		ApplicationContext app=new FileSystemXmlApplicationContext(filename);
		HotelDo hrdo=(HotelDo)app.getBean("ramizHelloworld");
		hrdo.getParentCall();
	}
	public static void main(String[] args) {
		System.out.println("HotelCustomerApp.main()");
		
		String arr[]={"rmaiz","fatima"};
		System.out.println("HotelCustomerApp.main() arr="+arr);
		mainfff(arr);
	}
	
	/*15, 2013 3:09:50 PM org.springframework.beans.factory.support.DefaultListableBeanFactory preInstantiateSingletons
	INFO: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@5ed2b042: defining beans [ramizHelloworld,subStudentDo]; root of factory hierarchy
	StudentDO.StudentDO()
	CollegeDO.CollegeDO() super consturtoro called.
	Exception in thread "main" org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'ramizHelloworld' defined in file [D:\RAMIZ_WORK\Spring_Tutorial_App\src\com\ramizm\autowireByName\autoWireByName.xml]: Error setting property values; nested exception is org.springframework.beans.NotWritablePropertyException: Invalid property 'hotelName' of bean class [com.ramizm.constructorBasedInjection.CollegeDO]: Bean property 'hotelName' is not writable or has an invalid setter method. Does the parameter type of the setter match the return type of the getter?
		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1423)
		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1128)
		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:519)
		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:458)
		at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:314)
		at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:194)
		at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1117)
		at com.ramizm.autowireByName.HotelCustomerApp.mainfff(HotelCustomerApp.java:16)
		at com.ramizm.autowireByName.HotelCustomerApp.main(HotelCustomerApp.java:24)
	Caused by: org.springframework.beans.NotWritablePropertyException: Invalid property 'hotelName' of bean class [com.ramizm.constructorBasedInjection.CollegeDO]: Bean property 'hotelName' is not writable or has an invalid setter method. Does the parameter type of the setter match the return type of the getter?
		at org.springframework.beans.BeanWrapperImpl.setPropertyValue(BeanWrapperImpl.java:1042)
		at org.springframework.beans.BeanWrapperImpl.setPropertyValue(BeanWrapperImpl.java:902)
		at org.springframework.beans.AbstractPropertyAccessor.setPropertyValues(AbstractPropertyAccessor.java:75)*/
	
}
