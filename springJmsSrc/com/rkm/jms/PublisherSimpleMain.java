package com.rkm.jms;

import java.util.Date;

public class PublisherSimpleMain {

	public static void main(String[] args) {
		System.out.println("PublisherSimpleMain.main() sending msg");
		RkmPublisher rp=new RkmPublisher();
		rp.send("testtopic", "first message at ="+new Date());
		System.out.println("PublisherSimpleMain.main() after sending mesgae");
		
	}
	
	
}
