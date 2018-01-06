package com.ramizm.byTypeAutoWiring;

public class NewByTypeDto {
	
	private String name;
	private String lname;
	private String idcheck;

	public String getLname() {
		return lname;
	}

	@Override
	public String toString() {
		return "NewByTypeDto [idcheck=" + idcheck + ", lname=" + lname
				+ ", name=" + name + "]";
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getIdcheck() {
		return idcheck;
	}

	public void setIdcheck(String idcheck) {
		this.idcheck = idcheck;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
