package com.rkm.jms;

public class SimpleSpringRkmBean {
	
	
	private String name;

	public String getName() {
		System.out.println("SimpleSpringRkmBean.getName() name="+name);
		return name;
	}

	public void setName(String name) {
		System.out.println("SimpleSpringRkmBean.setName() name");
		this.name = name;
	}
	

}
