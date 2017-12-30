package com.ramizm.singleTonScope;

public class FlatDO {

	public String msgId;

	public String getMsgId() {
		System.out.println("FlatDO.getMsgId()-"+msgId);
		return msgId;
	}

	public FlatDO() {
		super();
		System.out.println("FlatDO.FlatDO()");
		System.out.println("FlatDO.FlatDO()");
		// TODO Auto-generated constructor stub
	}

	public void setMsgId(String msgId) {
		System.out.println("FlatDO.setMsgId()="+msgId);
		this.msgId = msgId;
	}
	
}
