package com.ramizm.springInheritance;

public class FlatDoSun {

	String flatId;
	String buildingId;
	public String getBuildingId() {
		System.out.println("FlatDoSun.getBuildingId()="+buildingId);
		return buildingId;
	}

	public void setBuildingId(String buildingId) {
System.out.println("FlatDoSun.setBuildingId()="+buildingId);
		this.buildingId = buildingId;
	}

	public String getFlatId() {
		System.out.println("FlatDoSun.getFlatId()="+this.flatId);
		return flatId;
	}

	public void setFlatId(String flatId) {
		System.out.println("FlatDoSun.setFlatId()="+this.flatId);
		this.flatId = flatId;
	}
	
}
