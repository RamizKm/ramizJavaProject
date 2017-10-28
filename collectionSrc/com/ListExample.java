package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListExample {
	
	
	public static void main(String[] args) {
		ListTest();
	}
	
	public static void ListTest() {
		
		Set<String> st=new HashSet<String>();
		st.add("kop");
		st.add("pune");
		st.add("mumba");
		
		Iterator<String> it=st.iterator();
		System.out.println(it.toString());
		System.out.println(it);
		while(it.hasNext()) {
			
			String vl=it.next();
			System.out.println("vl="+vl);
			
		}
		
		
		
	}

}
