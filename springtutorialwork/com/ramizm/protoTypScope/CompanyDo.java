package com.ramizm.protoTypScope;

public class CompanyDo {

	String companyName;

	public String getCompanyName() {
		System.out.println("CompanyDo.getCompanyName()");
		return companyName;
	}

	public void setCompanyName(String companyName) {
		System.out.println("CompanyDo.setCompanyName()");
		this.companyName = companyName;
	}
	
	public CompanyDo()
	{
		System.out.println("CompanyDo.CompanyDo()");
	}
	
}
