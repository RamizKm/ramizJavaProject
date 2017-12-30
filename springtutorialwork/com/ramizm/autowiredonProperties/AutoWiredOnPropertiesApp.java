package com.ramizm.autowiredonProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ramizm.requiredAnnotation.TransportCompanyDO;

public class AutoWiredOnPropertiesApp {
	public static String filename="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/autowiredonProperties/requiredAnnotationByProperties.xml";
	

	public static void main(String[] args) {
		System.out.println("AutoWiredOnPropertiesApp.main() started..");
		ApplicationContext app=new FileSystemXmlApplicationContext(filename);
		FarmRequiredDO hrdo=(FarmRequiredDO)app.getBean("ramizHelloworld");
		hrdo.callSubParent();
		System.out.println("AutoWiredOnPropertiesApp.main() after fininsig hit");
}
}
/*
s
INFO: Loading XML bean definitions from file [D:\RAMIZ_WORK\Spring_Tutorial_App\src\com\ramizm\autowiredonProperties\requiredAnnotationByProperties.xml]
Dec 16, 2013 10:42:40 PM org.springframework.beans.factory.support.DefaultListableBeanFactory preInstantiateSingletons
INFO: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@6b915330: defining beans [org.springframework.context.annotation.internalConfigurationAnnotationProcessor,org.springframework.context.annotation.internalAutowiredAnnotationProcessor,org.springframework.context.annotation.internalRequiredAnnotationProcessor,org.springframework.context.annotation.internalCommonAnnotationProcessor,ramizHelloworld,org.springframework.context.annotation.ConfigurationClassPostProcessor.importAwareProcessor]; root of factory hierarchy
Exception in thread "main" org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'ramizHelloworld': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: public java.lang.String com.ramizm.autowiredonProperties.FarmRequiredDO.farmOwner; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [java.lang.String] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:288)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1116)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:519)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:458)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:314)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:194)
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1117)
	at com.ramizm.autowiredonProperties.AutoWiredOnPropertiesApp.main(AutoWiredOnPropertiesApp.java:15)
Caused by: org.springframework.beans.factory.BeanCreationException: Could not autowire field: public java.lang.String com.ramizm.autowiredonProperties.FarmRequiredDO.farmOwner; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [java.lang.String] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:514)
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:87)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:285)
	... 7 more
Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [java.lang.String] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.raiseNoSuchBeanDefinitionException(DefaultListableBeanFactory.java:986)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:856)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:768)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:486)
	... 9 more
*/



/*//after defining properly
INFO: Refreshing org.springframework.context.support.FileSystemXmlApplicationContext@425138a4: startup date [Mon Dec 16 22:51:40 IST 2013]; root of context hierarchy
Dec 16, 2013 10:51:40 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFO: Loading XML bean definitions from file [D:\RAMIZ_WORK\Spring_Tutorial_App\src\com\ramizm\autowiredonProperties\requiredAnnotationByProperties.xml]
Dec 16, 2013 10:51:40 PM org.springframework.beans.factory.support.DefaultListableBeanFactory preInstantiateSingletons
INFO: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@195198e8: defining beans [org.springframework.context.annotation.internalConfigurationAnnotationProcessor,org.springframework.context.annotation.internalAutowiredAnnotationProcessor,org.springframework.context.annotation.internalRequiredAnnotationProcessor,org.springframework.context.annotation.internalCommonAnnotationProcessor,ramizHelloworld,ownerDetails,org.springframework.context.annotation.ConfigurationClassPostProcessor.importAwareProcessor]; root of factory hierarchy
FarmRequiredDO.FarmRequiredDO()
Exception in thread "main" java.lang.NullPointerException
	at com.ramizm.autowiredonProperties.FarmRequiredDO.callSubParent(FarmRequiredDO.java:27)
	at com.ramizm.autowiredonProperties.AutoWiredOnPropertiesApp.main(AutoWiredOnPropertiesApp.java:16)*/
