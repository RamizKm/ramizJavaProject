package rkm.april19;

import java.util.TreeSet;

public class TreeSetRunTimeError {
	
	public static void main(String[] args) {
		
		CountryDO cd=new CountryDO();
		cd.setName("america");
		
		
		TreeSet tsd=new TreeSet();
		tsd.add("india");
		tsd.add(cd);
		tsd.add("america");
		System.out.println("TreeSetRunTimeError.enclosing_method() tsd="+tsd);
	}
	/*
	 * runtime exception
	 * Exception in thread "main" java.lang.ClassCastException: rkm.april19.CountryDO cannot be cast to java.lang.Comparable
	at java.util.TreeMap.put(TreeMap.java:565)
	at java.util.TreeSet.add(TreeSet.java:255)
	at rkm.april19.TreeSetRunTimeError.main(TreeSetRunTimeError.java)
	 * 
	 */

}
