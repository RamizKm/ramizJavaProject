package com;

import java.util.Calendar;

public class CalenderExample {

	public static void main(String[] args) {
		Calendar d=Calendar.getInstance();
		d.add(Calendar.HOUR, new Integer(1));
		
		System.out.println(d.getTime());
	}
	
	
	
}
