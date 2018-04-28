package com.hashset;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class SqlDateMapExample {
	public static void main(String[] args) {
		//for your case date from db //year-month-date
		java.sql.Date fromDate=new Date(2018,10,10);
		java.sql.Date toDate=new java.sql.Date(2030,10,20);
		
		//we can store any object in collections.
		//any class except primitive is object so w can store all in collections.
		Map<String,java.sql.Date> dateMap=new HashMap<String, java.sql.Date>();
		dateMap.put("frmDate", fromDate);
		dateMap.put("toDate", toDate);
		
		if(dateMap.containsKey("frmDate")) {
			java.sql.Date dbfromdate=dateMap.get("frmDate");
			System.out.println("SqlDateMapExample.main() dbfrmdta="+dbfromdate);
		}
		
		if(dateMap.containsKey("toDate")) {
			java.sql.Date toDbDate=dateMap.get("toDate");
			System.out.println("SqlDateMapExample.main() dbtodate="+toDbDate);
		}
		
		//below is also valid //value can be anything  .Every class object is implicitly object.
		//Object is default parent class even if it is not given
		Map<String,Object> objectDateMap=new HashMap<String, Object>();
		objectDateMap.put("objFromDate", fromDate);
		//you need to do typecasting
		if(objectDateMap.containsKey("objFromDate")) {
			java.sql.Date objFromDate=(Date) objectDateMap.get("objFromDate");
			System.out.println("SqlDateMapExample.main() objfroDate="+objFromDate);
		}
	}
}
