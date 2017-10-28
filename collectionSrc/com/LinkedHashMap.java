package com;

import java.util.Set;

public class LinkedHashMap {
	
	public static void main(String[] args) {
		
		java.util.LinkedHashMap<String,String> mp=new java.util.LinkedHashMap();
		mp.put("ab", "xy");
		mp.put("xy", "pq");
		System.out.println(mp);
		Set stringd=mp.keySet();
		System.out.println(stringd);
		
		mp.values();
		System.out.println(mp.values());
	}
	
	}
