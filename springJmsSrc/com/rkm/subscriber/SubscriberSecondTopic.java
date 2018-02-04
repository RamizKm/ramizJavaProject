package com.rkm.subscriber;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.annotation.JmsListeners;
import org.springframework.stereotype.Component;

@Component
public class SubscriberSecondTopic implements MessageListener {

	@JmsListener(destination="topic",containerFactory="conrkmfactory")
	public void receiveMessage(String email) {
		
		System.out.println("SubscriberSecondTopic.receiveMessage() msg received="+email);
		System.out.println("SubscriberSecondTopic.receiveMessage() end");
	}

	@Override
	public void onMessage(Message message) {
		System.out.println("SubscriberSecondTopic.onMessage() message reived");
		
		System.out.println("SubscriberSecondTopic.onMessage() started msg="+message);
		if(message instanceof TextMessage) {
			System.out.println("SubscriberSecondTopic.onMessage() content of textmsg");
			
		}
		
	}
	
}
