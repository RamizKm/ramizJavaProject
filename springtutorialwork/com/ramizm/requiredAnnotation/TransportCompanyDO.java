package com.ramizm.requiredAnnotation;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;
public class TransportCompanyDO {
	
	public String transportId;
	private String tranportName;
	
	public String getTranportName() {
		return tranportName;
	}
	
	@Required
	public void setTranportName(String tranportName) {
		this.tranportName = tranportName;
	}
	public String getTransportId() {
	System.out.println("TransportCompanyDO.getTransportId()");
		return transportId;
	}
@Required
	public void setTransportId(String transportId) {
		System.out.println("TransportCompanyDO.setTransportId()");
		this.transportId = transportId;
	}
@Required
	public List getTransportVendor() {
		System.out.println("TransportCompanyDO.getTransportVendor()");
		return transportVendor;
	}

	public void setTransportVendor(List transportVendor) {
System.out.println("TransportCompanyDO.setTransportVendor()");
		this.transportVendor = transportVendor;
	}

	public List transportVendor;

}
