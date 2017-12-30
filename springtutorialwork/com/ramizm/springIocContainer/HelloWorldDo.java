package com.ramizm.springIocContainer;

public class HelloWorldDo {

	public String message;

	public String getMessage() {
		System.out.println("HelloWorldDo.getMessage()="+message);
		return message;
	}

	public void setMessage(String message) {
		System.out.println("HelloWorldDo.setMessage()="+message);
		this.message = message;
	}
	
	
	
}
