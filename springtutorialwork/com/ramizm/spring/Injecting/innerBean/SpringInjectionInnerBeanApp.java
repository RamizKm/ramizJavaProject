package com.ramizm.spring.Injecting.innerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ramizm.protoTypScope.CompanyDo;

public class SpringInjectionInnerBeanApp {

	
	/*Java  inner  classes  are  defined  within  the  scope  of  other  classes, 
	similarly, inner  beans  are  beans  that  are  defined  within  the  scope  of  another  bean.  Thus,  a 
	<bean/> element inside  the <property/>  or  <constructor-arg/>  elements is called inner bean 
	and it is shown below.*/
	public static String filename="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/spring/Injecting/innerBean/SpringInjectionInnerBean.xml";

	
	public static void main(String[] args) {
		System.out.println("SpringInjectionInnerBeanApp.main()");
		ApplicationContext app=new FileSystemXmlApplicationContext(filename);
		ParentInfoDO hrdo=(ParentInfoDO)app.getBean("ramizHelloworld");
		hrdo.getAllChildInfoparent();
		System.out.println("SpringInjectionInnerBeanApp.main() after calling it.");
		
	}
/*	SpringInjectionInnerBeanApp.main()
	Dec 14, 2013 10:56:22 PM org.springframework.context.support.FileSystemXmlApplicationContext prepareRefresh
	INFO: Refreshing org.springframework.context.support.FileSystemXmlApplicationContext@45858aa4: startup date [Sat Dec 14 22:56:22 IST 2013]; root of context hierarchy
	Dec 14, 2013 10:56:22 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
	INFO: Loading XML bean definitions from file [D:\RAMIZ_WORK\Spring_Tutorial_App\src\com\ramizm\spring\Injecting\innerBean\SpringInjectionInnerBean.xml]
	Dec 14, 2013 10:56:23 PM org.springframework.beans.factory.support.DefaultListableBeanFactory preInstantiateSingletons
	INFO: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@67db7aae: defining beans [ramizHelloworld]; root of factory hierarchy
	Exception in thread "main" org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'ramizHelloworld' defined in file [D:\RAMIZ_WORK\Spring_Tutorial_App\src\com\ramizm\spring\Injecting\innerBean\SpringInjectionInnerBean.xml]: Error setting property values; nested exception is org.springframework.beans.NotWritablePropertyException: Invalid property 'companyName' of bean class [com.ramizm.spring.Injecting.innerBean.ParentInfoDO]: Bean property 'companyName' is not writable or has an invalid setter method. Does the parameter type of the setter match the return type of the getter?
		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1423)
		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1128)
		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:519)
*/}
