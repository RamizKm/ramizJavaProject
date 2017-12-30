package com.ramizm.springContextEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class contextStoppedEventApp implements ApplicationListener<ContextStoppedEvent>{

	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("contextStoppedEventApp.onApplicationEvent()");
		Object vd=event.getSource();
		System.out.println("contextStoppedEventApp.onApplicationEvent() vd="+vd);
		 long vddkd=event.getTimestamp();
		System.out.println("contextStoppedEventApp.onApplicationEvent() llong="+vddkd);
	}

}
