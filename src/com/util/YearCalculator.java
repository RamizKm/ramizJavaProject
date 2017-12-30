package com.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.datetime.DateFormatter;

public class YearCalculator {
	
	public static void main(String[] args) throws ParseException {
		
		String[] roleNodob=
			new String[]{"1-29/07/2010",
				"2-28/11/2010",
				"3-20/002/2010",
				"4-3/05/2011"
		};
		
		
		
		YearCalculator r=new YearCalculator();
		
		for(String st:roleNodob) {
			r.calcualtor(st);
		}
		
		
	}
	
	
	
	
	
	public void calcualtor(String roleNodob) throws ParseException{
		String[] split=roleNodob.split("-");
		String roleNo=split[0];
		String dob=split[1];
		
		//dob=dob.replace("/", "-");
	
		//29/11/1989
	Calendar cd=Calendar.getInstance();
	
	String[] yrs=dob.split("/");
	
	cd.set(Calendar.DAY_OF_MONTH, Integer.valueOf(yrs[0]));
	cd.set(Calendar.MONTH, (Integer.valueOf(yrs[1])-1));
	cd.set(Calendar.YEAR, Integer.valueOf(yrs[2]));

	System.out.println(cd.getTime());
	Calendar cr=Calendar.getInstance();
		int years=cr.get(Calendar.YEAR) -cd.get(Calendar.YEAR);
	int months=cr.get(Calendar.MONTH)-cd.get(Calendar.MONTH);
	System.out.println("months");
	
	//incomple implementation
	
	
	
	if(months==12) {
			years+=1;
			months=0;
		}
		System.out.println("roll no="+roleNo+" year="+years+" month="+months);
		
		
		
	}

}
 