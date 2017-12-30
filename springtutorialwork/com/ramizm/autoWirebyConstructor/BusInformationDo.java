package com.ramizm.autoWirebyConstructor;

public class BusInformationDo {
	
	private String busNo;
	private String busModel;
	public String getBusNo() {
		System.out.println("BusInformationDo.getBusNo()="+busNo);
		return busNo;
	}
	public void setBusNo(String busNo) {
		System.out.println("BusInformationDo.setBusNo()");
		this.busNo = busNo;
	}
	public String getBusModel() {
	System.out.println("BusInformationDo.getBusModel()="+busModel);
		return busModel;
	}
	public void setBusModel(String busModel) {
		this.busModel = busModel;
	}
	
	public void fetchAllBusInformation()
	{
		System.out.println("BusInformationDo.fetchAllBusInformation()");
		BusInformationDo bf=new BusInformationDo("MH09CT3053");
		System.out.println("BusInformationDo.fetchAllBusInformation() bf="+bf);
		System.out.println("BusInformationDo.fetchAllBusInformation() calling from child...");
		
	}
	public BusInformationDo(String busNo) {
		super();
		System.out.println("BusInformationDo.BusInformationDo() constructor using busNo");
		this.busNo = busNo;
		System.out.println("BusInformationDo.BusInformationDo() busno constructor.....");
	}
	public BusInformationDo() {
		super();
		System.out.println("BusInformationDo.BusInformationDo() default construtsor");
	}
	
	
	
	

}
