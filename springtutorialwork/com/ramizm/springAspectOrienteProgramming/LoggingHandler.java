package com.ramizm.springAspectOrienteProgramming;

public class LoggingHandler {
	
	public LoggingHandler()
	{
		super();
		System.out.println("LoggingHandler.LoggingHandler()");
	}

	public void beforeAdvice()
	{
		System.out.println("LoggingHandler.beforeAdvice() started.");
	}
	
	
	public void afterAdvice()
	{
		System.out.println("LoggingHandler.afterAdvice() started.");
	}

	public void afterReturningAdvice(Object returnValue)
	{
		System.out.println("LoggingHandler.afterReturningAdvice() returnvalue="+returnValue);
		Class t=returnValue.getClass();
		System.out.println("LoggingHandler.afterReturningAdvice() t="+t.getName());
		
	}
	//afterthrwoingadvice should be as afterThrowingAdvice
	public void AfterThrowingAdvice(Exception e)
	{
		System.out.println("LoggingHandler.afterThrowingAdvice() exception="+e);
	}
	
/*	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:458)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveInnerBean(BeanDefinitionValueResolver.java:271)
	... 25 more
Caused by: java.lang.IllegalArgumentException: Unable to locate method [AfterThrowingAdvice] on bean [logging]
	at org.springframework.aop.config.MethodLocatingFactoryBean.setBeanFactory(MethodLocatingFactoryBean.java:75)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeAwareMethods(AbstractAutowireCapableBeanFactory.java:1502)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1470)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:521)
	... 27 more*/
}
