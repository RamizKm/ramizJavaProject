package com.ramizm.MultipleSpringUtil;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;



@Configuration
@Import(FirstUtil.class)
//only one config annotation is allowed one time in class.
public class SecondConfigUtil {
	
	@Bean
	public SecondDo secondhrsdo()
	{
		System.out.println("SecondConfigUtil.secondhrsdo()");
		return new SecondDo();
	}

}
