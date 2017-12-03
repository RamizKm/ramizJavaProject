package com.rkm.dto;

public class ClassDto {
	
	private String roomId;
	private String floor;
	private String stdId;
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		System.out.println("ClassDto.setStdId()");
		this.stdId = stdId;
	}
	
	

}
