package com.ramizm.springContextEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class contextStartedEventAppHandler implements ApplicationListener<ContextStartedEvent>{

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		// TODO Auto-generated method stub
		
	 Object objv=event.getSource();
	 System.out.println("contextEventAppHandler.onApplicationEvent() obje="+objv);
		System.out.println("contextEventAppHandler.onApplicationEvent()");
		System.out.println("contextEventAppHandler.onApplicationEvent() event="+event);
	}

}
