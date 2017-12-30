package com.ramizm.MultipleSpringUtil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MultipleSpringUtilApp {

	public static void main(String[] args) {
		System.out.println("MultipleSpringUtilApp.main()");
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.register(FirstUtil.class);
		ctx.register(SecondDo.class);
		ctx.refresh();
		
		 Abcdo bc=ctx.getBean(Abcdo.class);
		 bc.getObjId();
		System.out.println("MultipleSpringUtilApp.main() dd="+bc.getObjId());
		
	}
	
	
}
