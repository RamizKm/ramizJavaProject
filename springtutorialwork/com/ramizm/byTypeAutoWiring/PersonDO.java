package com.ramizm.byTypeAutoWiring;

public class PersonDO {

	public String personId;
	private MobileDo mobileInfo;
	public String getPersonId() {
		System.out.println("PersonDO.getPersonId()");
		return personId;
	}
	public void setPersonId(String personId) {
	System.out.println("PersonDO.setPersonId()");
		this.personId = personId;
	}
	public MobileDo getMobileInfo() {
	System.out.println("PersonDO.getMobileInfo()");
		return mobileInfo;
	}
	public void setMobileInfo(MobileDo mobileInfo) {
		this.mobileInfo = mobileInfo;
	}
	
	public void retrieveMobilePersonInfo()
	{
		System.out.println("PersonDO.retrieveMobilePersonInfo() from parent calling sub.............paren........");
		mobileInfo.fetchDetails();
	}
	
	
}
