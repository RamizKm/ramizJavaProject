package com.ramizm.autowiredonProperties;

import org.springframework.beans.factory.annotation.Autowired;

public class FarmRequiredDO {

	//for properties on autowire,setter method shoujld not be there.
	
	//for properties.it should not be java primitive class ,it should be concrete class.
	private FarmOwnerDO ownerDetails;

	private FarmRequiredDO(FarmOwnerDO ownerDetails) {
		super();
		System.out.println("FarmRequiredDO.FarmRequiredDO()");
		this.ownerDetails = ownerDetails;
		System.out.println("FarmRequiredDO.FarmRequiredDO() after setting the details.....");
	}
	
	private FarmRequiredDO()
	{
		System.out.println("FarmRequiredDO.FarmRequiredDO()");
	}
	
	
	public void callSubParent()
	{
		//while declaring constructor private,it wll not be instantiatted.
		ownerDetails=new FarmOwnerDO();
		ownerDetails.getNameOfOwner();
		ownerDetails.getPriceOfOwner();
	}
	
	
}
