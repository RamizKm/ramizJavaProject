package com.rkm.dto;

public class FlatDto {
	private String flatNo;
	private String type;
	private String floor;
	private String ownerName;
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {
		return "FlatDto [flatNo=" + flatNo + ", type=" + type + ", floor="
				+ floor + ", ownerName=" + ownerName + "]";
	}
	
	
}
