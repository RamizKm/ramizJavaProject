package com.rkm.jms;

import org.springframework.jms.core.JmsTemplate;

public class RkmPublisher {
	
	JmsTemplate jmsTemp;

	public JmsTemplate getJmsTemp() {
		System.out.println("RkmPublisher.getJmsTemp() jmstemp="+jmsTemp);
		return jmsTemp;
	}

	public void setJmsTemp(JmsTemplate jmsTemp) {
		System.out.println("RkmPublisher.setJmsTemp() jmstemp="+jmsTemp);
		this.jmsTemp = jmsTemp;
	}
	
	
	public void send(String topicName,String msg) {
		
		SpringJmsTempalteBeanCopy sjt=new SpringJmsTempalteBeanCopy();
		jmsTemp=sjt.getJmsTemplate();
		System.out.println("RkmPublisher.send() jt="+jmsTemp);
	System.out.println("RkmPublisher.send() msg="+msg);
		System.out.println("jms details="+jmsTemp);
	jmsTemp.convertAndSend(topicName,msg);
	
	
	}
	

}
