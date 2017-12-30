package com.ramizm.autowireByName;

import java.util.ArrayList;
import java.util.List;
public class HotelCustomerDo {
	
	public HotelCustomerDo(String customerOrderId) {
		super();
		this.customerOrderId = customerOrderId;
	}


	private String customerOrderId;
	private List customerOrderList;
	
	
	
	public String getCustomerOrderId() {
		return customerOrderId;
	}
	public void setCustomerOrderId(String customerOrderId) {
		System.out.println("HotelCustomerDo.setCustomerOrderId()="+customerOrderId);
		this.customerOrderId = customerOrderId;
	}
	public List getCustomerOrderList() {
		System.out.println("HotelCustomerDo.getCustomerOrderList()="+this.customerOrderList);
		return customerOrderList;
	}
	public void setCustomerOrderList(List customerOrderList) {
		
		this.customerOrderList = customerOrderList;
		System.out.println("HotelCustomerDo.setCustomerOrderList()="+this.customerOrderList);
	}
	
	public HotelCustomerDo()
	{
		System.out.println("HotelCustomerDo.HotelCustomerDo()");
	}
	
	
	public void retrieveAllCustomerInformation()
	{
		System.out.println("HotelCustomerDo.retrieveAllCustomerInformation()");
		HotelCustomerDo chs=new HotelCustomerDo("OI123");
		HotelCustomerDo second=new HotelCustomerDo("OI123");
		ArrayList al=new ArrayList();
		al.add(chs);
		al.add(second);
		System.out.println("HotelCustomerDo.retrieveAllCustomerInformation() al="+al);
		
		
	}
	@Override
	public String toString() {
		return "HotelCustomerDo [customerOrderId=" + customerOrderId
				+ ", customerOrderList=" + customerOrderList
				+ ", getCustomerOrderId()=" + getCustomerOrderId()
				+ ", getCustomerOrderList()=" + getCustomerOrderList()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
