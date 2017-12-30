package com.ramizm.springContextEvent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class contextEventApp {
	
	public static String fileName="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/springContextEvent/contextEvent.xml";

	public static void main(String[] args) {
		System.out.println("contextEventApp.main()");
		System.out.println("contextEventApp.main() started..");
		
		ConfigurableApplicationContext cont=new FileSystemXmlApplicationContext(fileName);
		System.out.println("contextEventApp.main() context="+cont);
	
	cont.start();
	
	NoteBookDO hr=(NoteBookDO)cont.getBean("helloWorld");
	hr.getNotebookId();
	hr.getNotebookName();
	cont.stop();
	
	}
	
}
