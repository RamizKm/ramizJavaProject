package com.ramizm.springBeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class FilterLikeClass  implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("FilterLikeClass.postProcessAfterInitialization()");
		// TODO Auto-generated method stub
		System.out.println("FilterLikeClass.postProcessAfterInitialization()="+bean);
		System.out.println("FilterLikeClass.postProcessAfterInitialization(=)"+beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("FilterLikeClass.postProcessAfterInitialization()="+bean);
		System.out.println("FilterLikeClass.postProcessAfterInitialization(=)"+beanName);
		return bean;
		
	}

}
