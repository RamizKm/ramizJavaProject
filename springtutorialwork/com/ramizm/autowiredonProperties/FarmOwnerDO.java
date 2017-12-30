package com.ramizm.autowiredonProperties;

public class FarmOwnerDO {
	
	public String nameOfOwner;
	public String priceOfOwner;
	public String getNameOfOwner() {
		return nameOfOwner;
	}
	public void setNameOfOwner(String nameOfOwner) {
		System.out.println("FarmOwnerDO.setNameOfOwner()");
		this.nameOfOwner = nameOfOwner;
	}
	public String getPriceOfOwner() {
		System.out.println("FarmOwnerDO.getPriceOfOwner()");
		return priceOfOwner;
	}
	public void setPriceOfOwner(String priceOfOwner) {
		System.out.println("FarmOwnerDO.setPriceOfOwner()");
		this.priceOfOwner = priceOfOwner;
	}
	
	protected FarmOwnerDO()
	{
		System.out.println("FarmOwnerDO.FarmOwnerDO()");
	}

	
}
