package com.rkm.jms;

import org.springframework.jms.annotation.JmsListener;

public class RkmSecondSubscriber {
	
	
	@JmsListener(destination="testtopic")
	public void receiveMsg(String t) {
		
		System.out.println("RkmSecondSubscriber.receiveMsg()");
		
		System.out.println("RkmSecondSubscriber.receiveMsg() t="+t );
		
	}

}
