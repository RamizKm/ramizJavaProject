package com.ramizm.springJdbcStoredProcedure;

public class FlatJdbcDO {

	public FlatJdbcDO()
	{
		System.out.println("FlatJdbcDO.FlatJdbcDO()");
	}
	
	public String flatId;
	public String flatOwner;
	public String societyId;
	@Override
	public String toString() {
		return "FlatJdbcDO [flatId=" + flatId + ", flatOwner=" + flatOwner + ", societyId=" + societyId + "]";
	}
	public String getSocietyId() {
		System.out.println("FlatJdbcDO.getSocietyId()="+societyId);
		return societyId;
	}
	public void setSocietyId(String societyId) {
		this.societyId = societyId;
	}
	public String getFlatId() {
		System.out.println("FlatJdbcDO.getFlatId()="+flatId);
		return flatId;
	}
	public void setFlatId(String flatId) {
		this.flatId = flatId;
		System.out.println("FlatJdbcDO.setFlatId()");
	}
	public String getFlatOwner() {
		System.out.println("FlatJdbcDO.getFlatOwner()");
		return flatOwner;
	}
	public void setFlatOwner(String flatOwner) {
		this.flatOwner = flatOwner;
		System.out.println("FlatJdbcDO.setFlatOwner()");
	}
	
	
	
}
