package com.rkm.jms;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.jms.core.JmsTemplate;



public class SpringJmsTempalteBean {


	
	public JmsTemplate getJmsTemplate() {
		JmsTemplate js=new JmsTemplate();
		js.setConnectionFactory(getConFactory());
		js.setPubSubDomain(true);
		System.out.println("SpringJmsTempalteBean.getJmsTemplate() js="+js);
		return js;
	}
	
	
	public ActiveMQConnectionFactory getConFactory() {
		ActiveMQConnectionFactory fact=new ActiveMQConnectionFactory();
		fact.setBrokerURL(ActiveMQConnection.DEFAULT_BROKER_URL);
		fact.setUserName("admin");
		fact.setPassword("admin");
		
		System.out.println("SpringJmsTempalteBean.getConFactory() url="+fact.getBrokerURL());
		System.out.println("SpringJmsTempalteBean.getConFactory() fact="+fact);
		return fact;
		
	}

}
