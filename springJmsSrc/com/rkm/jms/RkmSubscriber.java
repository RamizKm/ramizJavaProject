package com.rkm.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;


@Component
public class RkmSubscriber {
	
	
	JmsTemplate jms;
	
	@JmsListener(destination="testtopic")
	public void receive(String msg) {
				
		System.out.println("RkmSubscriber.receive()msg received="+msg);
		
	}

}
