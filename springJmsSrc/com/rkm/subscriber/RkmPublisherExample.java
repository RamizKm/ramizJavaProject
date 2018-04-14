package com.rkm.subscriber;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Topic;
import javax.jms.TopicPublisher;

import org.apache.activemq.ActiveMQSession;
import org.apache.activemq.ActiveMQTopicPublisher;
import org.apache.activemq.command.ActiveMQDestination;

public class RkmPublisherExample  extends ActiveMQTopicPublisher{

	protected RkmPublisherExample(ActiveMQSession session,
			ActiveMQDestination destination, int sendTimeout)
			throws JMSException {
		super(session, destination, sendTimeout);
			System.out.println("RkmPublisherExample.RkmPublisherExample()");
	}

	
	
}