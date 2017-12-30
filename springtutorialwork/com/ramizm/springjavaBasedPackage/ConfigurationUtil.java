package com.ramizm.springjavaBasedPackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigurationUtil {

	@Bean
	public CollegeDO collegeDOHr()
	{
		System.out.println("ConfigurationUtil.collegeDOHr()");
		return new CollegeDO();
	}
	
	
	public ConfigurationUtil()
	{
		System.out.println("ConfigurationUtil.ConfigurationUtil()");
	}
	
}
