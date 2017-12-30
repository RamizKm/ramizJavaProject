package com.ramizm.springInheritance;

public class BuildingInheritanceDO {
	
	
	String buildingId;

	public String getBuildingId() {
		System.out.println("BuildingInheritanceDO.getBuildingId()="+buildingId);
		return buildingId;
	}

	public void setBuildingId(String buildingId) {
		System.out.println("BuildingInheritanceDO.setBuildingId()="+this.buildingId);
		this.buildingId = buildingId;
	}
	
	public BuildingInheritanceDO()
	{
		System.out.println("BuildingInheritanceDO.BuildingInheritanceDO()");
	}

}
