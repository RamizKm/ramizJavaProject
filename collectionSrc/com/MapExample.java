package com;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		
		Map<String,String> mp=new HashMap<String, String>();
		
		mp.put("139", "hadapsar-nigdi");
		mp.put("204", "bhekrai-chinchawad");
		mp.put("111", "hadapsar-manapa");
		mp.put("148", "shewalewadi-pimpale gurav");
		mp.put("207", "swargate-saswad");
		
		getRoutName(mp, "139");
		getRoutName(mp, "301");
		getRoutName(mp, "203");
		getRoutName(mp, "111");
	}

	public static void getRoutName(Map mp,String routeId)
	{
		String vl=(String) mp.get(routeId);
		System.out.println("routied="+routeId+" name="+vl);
	}
	
	
}
