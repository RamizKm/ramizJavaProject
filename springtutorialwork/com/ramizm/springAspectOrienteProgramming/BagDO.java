package com.ramizm.springAspectOrienteProgramming;

public class BagDO {
	
	
	public BagDO()
	{super();
		System.out.println("BagDO.BagDO()");
		System.out.println("BagDO.BagDO()bagiId="+this.bagId+"\t bagBanchd="+bagBrand);
	}

	public String bagId;
	public String bagBrand;
	public String getBagId() {
		System.out.println("BagDO.getBagId() bagId="+bagId	);
		return bagId;
	}
	public void setBagId(String bagId) {
		System.out.println("BagDO.setBagId()");
		this.bagId = bagId;
	}
	public String getBagBrand() {
	System.out.println("BagDO.getBagBrand()");
		return bagBrand;
	}
	public void setBagBrand(String bagBrand) {
		this.bagBrand = bagBrand;
		System.out.println("BagDO.setBagBrand()");
	}
	
	public void printThrowException() throws Exception
	{
		System.out.println("BagDO.printThrowException()");
		throw new RamizRuntimeException("exception is being thrown");
		
		
	}
	
}
