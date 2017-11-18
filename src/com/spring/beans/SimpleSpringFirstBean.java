package com.spring.beans;

public class SimpleSpringFirstBean {
	
	
	public SimpleSpringFirstBean() {
		System.out.println("SimpleSpringFirstBean constructor");
	}
	
	private String name;
	private String details;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	

}
