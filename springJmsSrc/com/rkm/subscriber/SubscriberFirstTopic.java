package com.rkm.subscriber;

import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

public class SubscriberFirstTopic {
	
	
	public DefaultJmsListenerContainerFactory connectionFactory() {
		DefaultJmsListenerContainerFactory fact=new DefaultJmsListenerContainerFactory();
		
		fact.setSubscriptionDurable(true);
	//	fact.setConnectionFactory(connectionFactory);
		
		fact.setClientId("testsubscriber");
		return fact;
		
	}
	
	
	
	
	

}
