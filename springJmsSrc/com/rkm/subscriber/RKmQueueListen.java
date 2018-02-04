package com.rkm.subscriber;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.listener.SessionAwareMessageListener;

public class RKmQueueListen implements MessageListener{

	
	
	private String name="";

	@Override
	@JmsListener(destination="queue",containerFactory="conrkmfactory")
	public void onMessage(Message message) {
		System.out.println("message is received .will send it shortly");
		String name=message.getClass().getName();
		System.out.println("RKmQueueListen.onMessage() name="+name);
		
		
		if(message instanceof TextMessage) {
			
			String textvlaue=null;
			try {
				textvlaue = ((TextMessage) message).getText();
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("RKmQueueListen.onMessage() text vlaue="+textvlaue);
		}
		
	}


	
}
