package com.ramizm.springIocContainer.Filesystem;

public class HelloworldDOxmlDO {
	
	public HelloworldDOxmlDO()
	{
		System.out.println("HelloworldDOxmlDO.HelloworldDOxmlDO()");
	}
	
	static
	{
		System.out.println("HelloworldDOxmlDO.enclosing_method() static blocik");
	}
	
	{
		System.out.println("HelloworldDOxmlDO.enclosing_method() normal blockl..");
	}
	
	public String messageId;

	public String getMessageId() {
		System.out.println("HelloworldDOxmlDO.getMessageId()");
		return messageId;
	}

	public void setMessageId(String messageId) {
		System.out.println("HelloworldDOxmlDO.setMessageId()");
		this.messageId = messageId;
	}

}
