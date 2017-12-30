package com.ramizm.autoWirebyConstructor;

public class BusDepoDO {
	
	private BusInformationDo busContent;

	public BusDepoDO()
	{
		super();
		System.out.println("BusDepoDO.BusDepoDO() constuctor coming");
	}
	
	public BusInformationDo getBusContent() {
		return busContent;
	}

	public void setBusContent(BusInformationDo busContent) {
		this.busContent = busContent;
	}
	
	public BusDepoDO(BusInformationDo busContent) {
		super();
		System.out.println("BusDepoDO.BusDepoDO() construtor using fields");
		this.busContent = busContent;
		System.out.println("BusDepoDO.BusDepoDO() constructor using fields...");
	}
	
	public void fetchBusInfo()
	{
		System.out.println("BusDepoDO.fetchBusInfo() calling sub from parent.......");
		busContent.fetchAllBusInformation();
		System.out.println("BusDepoDO.fetchBusInfo()");
	}
	

}
