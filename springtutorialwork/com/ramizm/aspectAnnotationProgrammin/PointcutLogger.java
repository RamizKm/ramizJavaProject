package com.ramizm.aspectAnnotationProgrammin;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutLogger {

	
	@Pointcut("execution(*com.ramizm.aspectAnnotationProgrammin.*.*(..))")
	private void selectAll()
	{
		//it is declared abstract
	}
	@Before("selectAll()")
	public void BeforeAdvice()
	{
		//it shuouldbe declared public
		System.out.println("PointcutLogger.BeforeAdvice() started..");
	}

/*	//@Before("selectAll")
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:295)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:223)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:292)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:194)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:626)
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:932)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:479)
	at org.springframework.context.support.FileSystemXmlApplicationContext.<init>(FileSystemXmlApplicationContext.java:140)
	at org.springframework.context.support.FileSystemXmlApplicationContext.<init>(FileSystemXmlApplicationContext.java:84)
	at com.ramizm.aspectAnnotationProgrammin.AnnotationAspectAppHandler.main(AnnotationAspectAppHandler.java:20)
Caused by: java.lang.IllegalArgumentException: Pointcut is not well-formed: expecting '(' at character position 0
selectAll
^

	at org.aspectj.weaver.tools.PointcutParser.resolvePointcutExpression(PointcutParser.java:335)
	at org.aspectj.weaver.tools.PointcutParser.parsePointcutExpression(PointcutParser.java:310)
	at org.springframework.aop.aspectj.AspectJExpressionPointcut.buildPointcutExpression(AspectJExpressionPointcut.java:208)
	at org.springframework.aop.aspectj.AspectJExpressionPointcut.buildPointcutExpression(AspectJExpressionPointcut.java:194)
	at org.springframework.aop.aspectj.AspectJExpressionPointcut.checkReadyToMatch(AspectJExpressionPointcut.java:183)
	at org.springframework.aop.aspectj.AspectJExpressionPointcut.getClassFilter(AspectJExpressionPointcut.java:164)
	at org.springframework.aop.support.AopUtils.canApply(AopUtils.java:208)
	at org.springframework.aop.support.AopUtils.canApply(AopUtils.java:262)
	at org.springframework.aop.support.AopUtils.findAdvisorsThatCanApply(AopUtils.java:294)
	at org.springframework.aop.framework.autoproxy.AbstractAdvisorAutoProxyCreator.findAdvisorsThatCanApply(AbstractAdvisorAutoProxyCreator.java:118)
	at org.springframework.aop.framework.autoproxy.AbstractAdvisorAutoProxyCreator.findEligibleAdvisors(AbstractAdvisorAutoProxyCreator.java:88)
	at org.springframework.aop.framework.autoproxy.AbstractAdvisorAutoProxyCreator.getAdvicesAndAdvisorsForBean(AbstractAdvisorAutoProxyCreator.java:69)
	at org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator.wrapIfNecessary(AbstractAutoProxyCreator.java:359)
	at org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator.postProcessAfterInitialization(AbstractAutoProxyCreator.java:322)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyBeanPostProcessorsAfterInitialization(AbstractAutowireCapableBeanFactory.java:409)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1488)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:521)
	... 11 more
	*/
	
	@After("selectAll()")
	public void afterAdvice()
	{
		System.out.println("PointcutLogger.afterAdvice() started.");
		
	}
	
	@AfterReturning(pointcut="selectAll()",returning="retVal")
	public void afterReturningAdvice(Object retVal)
	{
		System.out.println("PointcutLogger.afterReturningAdvice()");
		System.out.println("PointcutLogger.afterReturningAdvice() retvalu="+retVal);
	}
	
	@AfterThrowing(pointcut="selectAll()",throwing="e")
	public void afterThrowingAdvice(Exception e)
	{
		System.out.println("PointcutLogger.afterThrowingAdvice() e="+e);
		
	}
	
}
