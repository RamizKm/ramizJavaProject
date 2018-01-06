package com.ramizm.springjdbc.clob;

public class StudentDto {
	
	
	private String stdFName;
	private String StdMName;
	private String stdLname;
	private String stddob;
	private String stdParentName;
	private String stdParentMobNo;
	private String stdEmergencyOtherNo;
	private String stdId;
	public String getStdFName() {
		return stdFName;
	}
	public void setStdFName(String stdFName) {
		this.stdFName = stdFName;
	}
	public String getStdMName() {
		return StdMName;
	}
	public void setStdMName(String stdMName) {
		StdMName = stdMName;
	}
	public String getStdLname() {
		return stdLname;
	}
	public void setStdLname(String stdLname) {
		this.stdLname = stdLname;
	}
	public String getStddob() {
		return stddob;
	}
	public void setStddob(String stddob) {
		this.stddob = stddob;
	}
	public String getStdParentName() {
		return stdParentName;
	}
	public void setStdParentName(String stdParentName) {
		this.stdParentName = stdParentName;
	}
	public String getStdParentMobNo() {
		return stdParentMobNo;
	}
	public void setStdParentMobNo(String stdParentMobNo) {
		this.stdParentMobNo = stdParentMobNo;
	}
	public String getStdEmergencyOtherNo() {
		return stdEmergencyOtherNo;
	}
	public void setStdEmergencyOtherNo(String stdEmergencyOtherNo) {
		this.stdEmergencyOtherNo = stdEmergencyOtherNo;
	}
	
	
	
	
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	@Override
	public String toString() {
		return "StudentDto [StdMName=" + StdMName + ", stdEmergencyOtherNo="
				+ stdEmergencyOtherNo + ", stdFName=" + stdFName
				+ ", stdLname=" + stdLname + ", stdParentMobNo="
				+ stdParentMobNo + ", stdParentName=" + stdParentName
				+ ", stddob=" + stddob + "]";
	}

}
