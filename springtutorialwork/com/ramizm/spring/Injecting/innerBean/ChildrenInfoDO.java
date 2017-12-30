package com.ramizm.spring.Injecting.innerBean;

public class ChildrenInfoDO {
	
	
	private int noOfChild;
	private String childernName;
	public int getNoOfChild() {
		System.out.println("ChildrenInfoDO.getNoOfChild()="+this.noOfChild);
		return noOfChild;
	}
	public void setNoOfChild(int noOfChild) {
		this.noOfChild = noOfChild;
	}
	public String getChildernName() {
		System.out.println("ChildrenInfoDO.getChildernName()="+this.childernName);
		return childernName;
	}
	public void setChildernName(String childernName) {
		this.childernName = childernName;
	}
	
	public void getAllChildInfoStudent()
	{
		System.out.println("ChildrenInfoDO.getAllChildInfo()");
		
		ChildrenInfoDO chil=new ChildrenInfoDO();
		chil.setChildernName("rmaiz momin");
		chil.setNoOfChild(3);
		System.out.println("ChildrenInfoDO.getAllChildInfo() chil="+chil);
		
		
	}
	@Override
	public String toString() {
		return "ChildrenInfoDO [childernName=" + childernName + ", noOfChild="
				+ noOfChild + "]";
	}
	

}
