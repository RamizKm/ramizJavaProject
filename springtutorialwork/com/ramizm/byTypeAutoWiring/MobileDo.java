package com.ramizm.byTypeAutoWiring;

public class MobileDo {
	
	public String getMobileModel() {
		System.out.println("MobileDo.getMobileModel()");
		return mobileModel;
	}
	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}
	public int getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	private String mobileModel;
	private int mobilePrice;
	public MobileDo(String mobileModel) {
		super();
		System.out.println("MobileDo.MobileDo() constructor");
		this.mobileModel = mobileModel;
		System.out.println("MobileDo.MobileDo() constructor ended.");
	}
	
	public MobileDo()
	{
		System.out.println("MobileDo.MobileDo()");
	}

		public void fetchDetails()
		{
			System.out.println("MobileDo.fetchDetails()started....");
			MobileDo mb=new MobileDo("C2332");
			mb.setMobilePrice(3000);
			System.out.println("MobileDo.fetchDetails() mb="+mb);
			
			
		}
		@Override
		public String toString() {
			return "MobileDo [mobileModel=" + mobileModel + ", mobilePrice="
					+ mobilePrice + "]";
		}
	
	
	
	
	
}
