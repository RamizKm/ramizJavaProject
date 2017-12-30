package com.ramizm.springCustomEvent;

import org.springframework.context.ApplicationEvent;

public class RamizCustomEvent extends ApplicationEvent
{

	public RamizCustomEvent(Object source) {
		super(source);
		System.out.println("RamizCustomEvent.RamizCustomEvent()");
		Class t=source.getClass();
		System.out.println("RamizCustomEvent.RamizCustomEvent() t="+t);
		String namek=t.getCanonicalName();
		System.out.println("RamizCustomEvent.RamizCustomEvent() namek="+namek);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		System.out.println("RamizCustomEvent.toString()");
		return "RamizCustomEvent [source=" + source + ", getTimestamp()="
				+ getTimestamp() + ", getSource()=" + getSource()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";

	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
