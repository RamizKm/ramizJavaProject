package com.ramizm.injectingCollection;

import java.util.List;
import java.util.Set;
import java.util.Map;


public class CollegeCollectionDO {
	
	
	public CollegeCollectionDO()
	{
		System.out.println("CollegeCollectionDO.CollegeCollectionDO()");
	}

	public List employeeList;
	public Set vendorSet;
	public Map assetMap;
	
	
	public List getEmployeeList() {
		System.out.println("CollegeCollectionDO.getEmployeeList()="+employeeList);
		return employeeList;
	}
	public void setEmployeeList(List employeeList) {
		this.employeeList = employeeList;
		System.out.println("CollegeCollectionDO.setEmployeeList()="+employeeList);
	}
	public Set getVendorSet() {
		return vendorSet;
	}
	public void setVendorSet(Set vendorSet) {
		this.vendorSet = vendorSet;
		System.out.println("CollegeCollectionDO.setVendorSet() vnod="+vendorSet);
	}
	public Map getAssetMap() {
		return assetMap;
	}
	public void setAssetMap(Map assetMap) {
		this.assetMap = assetMap;
		System.out.println("CollegeCollectionDO.setAssetMap() map="+assetMap);
	}
	
	
	
}
