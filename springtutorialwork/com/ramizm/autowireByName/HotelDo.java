package com.ramizm.autowireByName;

public class HotelDo {
	
	public HotelDo()
	{
		System.out.println("HotelDo.HotelDo() started.");
	}

	private String hotelName;
	
	private HotelCustomerDo ramizCustomerDo;

	

	public String getHotelName() {
		System.out.println("HotelDo.getHotelName()="+hotelName);
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		System.out.println("HotelDo.setHotelName()=");
		this.hotelName = hotelName;
	}

	public HotelCustomerDo getRamizCustomerDo() {
		System.out.println("HotelDo.getRamizCustomerDo()");
		return ramizCustomerDo;
	}

	public void setRamizCustomerDo(HotelCustomerDo ramizCustomerDo) {
		System.out.println("HotelDo.setRamizCustomerDo()");
		this.ramizCustomerDo = ramizCustomerDo;
	}

	public void getParentCall() {
		
		System.out.println("HotelDo.getParentCall()");
		System.out.println("HotelDo.getParentCall() started..from parent hi....................");
		ramizCustomerDo.retrieveAllCustomerInformation();
		// TODO Auto-generated method stub
		
	}



	
	
}
