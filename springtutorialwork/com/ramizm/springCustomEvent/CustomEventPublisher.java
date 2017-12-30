package com.ramizm.springCustomEvent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisherEvent;
	
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		System.out.println("CustomEventPublisher.setApplicationEventPublisher()");
		Class t = publisher.getClass();
		System.out.println("CustomEventPublisher.setApplicationEventPublisher() t=" + t);
		System.out.println("CustomEventPublisher.setApplicationEventPublisher()");

	}
	
	public void publish()
	{
		System.out.println("CustomEventPublisher.publish() going to publish event before");
		//customer event initialization
		RamizCustomEvent evetn=new RamizCustomEvent(this);
		
		if(publisherEvent==null)
		{
			System.out.println("CustomEventPublisher.publish() ist is null");
			//publisherEvent=new 
		}
		
		publisherEvent.publishEvent(evetn);
		System.out.println("CustomEventPublisher.publish() after publishing event");
	}
	

}
