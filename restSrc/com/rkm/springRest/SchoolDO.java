package com.rkm.springRest;

import org.springframework.stereotype.Component;

@Component
public class SchoolDO {
	
	public SchoolDO() {
		System.out.println("SchoolDO.enclosing_method() constructor");
	}
	
	private String name;
	private String address;
	private String type;
	private String schooldId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSchooldId() {
		return schooldId;
	}
	public void setSchooldId(String schooldId) {
		this.schooldId = schooldId;
	}
	@Override
	public String toString() {
		return "SchoolDO [name=" + name + ", address=" + address + ", type="
				+ type + ", schooldId=" + schooldId + "]";
	}
	
	

}
