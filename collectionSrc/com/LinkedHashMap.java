package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
		
		Map<String,ArrayList<String>> mpcity=new HashMap<String, java.util.ArrayList<String>>();
		
		
		ArrayList<String> klist=new ArrayList<String>();
		
		klist.add("vadgaon");
		klist.add("kurundwad");
		klist.add("ichalkaranji");
		
		ArrayList<String> statelist=new ArrayList<String>(Arrays.asList("Maharastra","Karnataka"));
		
		ArrayList<String> citymaharastra=new ArrayList<String>();
		citymaharastra.add("kolhapur");
		citymaharastra.add("Pune");
		
		System.out.println("mpcity:"+mpcity);
		System.out.println("klist:"+klist);
		System.out.println("state:"+statelist);
		System.out.println("citymaharastra:"+citymaharastra);
		
		mpcity.put(statelist.get(0),citymaharastra);
		mpcity.put("kolhapur", klist);
		
		ArrayList<String> getcity=mpcity.get("Maharastra");
		System.out.println("getcity:"+getcity);
		
		
		
	//	Iterator< >
		System.out.println("mpcity:"+mpcity);
		if(getcity.contains("Mumbai"))
		{
			System.out.println(getcity.contains("Mumbai"));
		}
		System.out.println(getcity.contains("Mumbai"));
		
		System.out.println(mpcity.containsKey("Telagana"));
		
	
		
		
		
	}
	
	
	
	}
