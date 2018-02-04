package com.rkm.subscriber;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class SubscriberThiirdTopicListner implements MessageListener {

	@Override
	public void onMessage(Message message) {
		System.out.println("SubscriberThiirdTopicListner.onMessage() listening to topic");
		
		if(message instanceof TextMessage) {
			
			try {
				String td=((TextMessage) message).getText();
				System.out.println("SubscriberThiirdTopicListner.onMessage() td="+td);
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
