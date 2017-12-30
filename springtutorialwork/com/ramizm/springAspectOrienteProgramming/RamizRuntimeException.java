package com.ramizm.springAspectOrienteProgramming;

public class RamizRuntimeException extends RuntimeException{

	/**
	 * \
	 */
	private static final long serialVersionUID = 1L;

	
	public String resultMsg;
	
	public String getResultMsg() {
		System.out.println("RamizRuntimeException.getResultMsg()");
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		System.out.println("RamizRuntimeException.setResultMsg()");
		this.resultMsg = resultMsg;
	}

	public RamizRuntimeException(String msg)
	{
		//super();
		super("ramizthrowingruntimexcetion");
		this.resultMsg=msg;
	}
	
}
