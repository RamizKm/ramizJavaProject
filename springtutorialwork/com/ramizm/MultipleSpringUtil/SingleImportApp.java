package com.ramizm.MultipleSpringUtil;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingleImportApp {

	public static void main(String[] args) {
		System.out.println("SingleImportApp.main()");
		
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SecondConfigUtil.class);
	System.out.println("SingleImportApp.main() ctx="+ctx);
	Abcdo abc=ctx.getBean(Abcdo.class);
	System.out.println("SingleImportApp.main() abc="+abc);
	
	}
	
}
