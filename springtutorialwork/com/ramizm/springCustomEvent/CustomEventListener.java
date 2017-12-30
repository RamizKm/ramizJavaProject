package com.ramizm.springCustomEvent;

import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener<RamizCustomEvent>{

	@Override
	public void onApplicationEvent(RamizCustomEvent event) {
		// TODO Auto-generated method stub
		System.out.println("CustomEventListener.onApplicationEvent()");
		Object eventOb=event.getClass();
		System.out.println("CustomEventListener.onApplicationEvent() class event="+eventOb.getClass().getName());
	 Object ob=event.getSource();
		System.out.println("CustomEventListener.onApplicationEvent() ob="+ob);
		Class t=ob.getClass();
		System.out.println("CustomEventListener.onApplicationEvent() t="+t.getName());
	}

}
