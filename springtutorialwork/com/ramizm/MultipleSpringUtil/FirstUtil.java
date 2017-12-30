package com.ramizm.MultipleSpringUtil;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FirstUtil {

	@Bean
	public Abcdo abcHrdo()
	{
		System.out.println("FirstUtil.abcHrdo()");
		System.out.println("FirstUtil.abcHrdo()");
		return new Abcdo();
	}
}
