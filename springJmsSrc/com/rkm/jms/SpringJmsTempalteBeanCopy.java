package com.rkm.jms;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.jms.core.JmsTemplate;



public class SpringJmsTempalteBeanCopy {


	
	public JmsTemplate getJmsTemplate() {
		JmsTemplate js=new JmsTemplate();
		js.setConnectionFactory(getConFactory());
		js.setPubSubDomain(true);
		System.out.println("SpringJmsTempalteBean.getJmsTemplate() js="+js);
		return js;
	}
	
	
	public ActiveMQConnectionFactory getConFactory() {
		ActiveMQConnectionFactory fact=new ActiveMQConnectionFactory();
		fact.setBrokerURL("tcp://localhost:61616");
		fact.setUserName("admin");
		fact.setPassword("admin");
		System.out.println("SpringJmsTempalteBean.getConFactory() fact="+fact);
		return fact;
		
	}

}
