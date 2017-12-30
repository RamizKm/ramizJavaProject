package com.ramizm.importAnnotation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
public class ListIterator {

	public static void main(String[] args) {
		
		
		List al=new ArrayList();
		al.add("ramiz");
		al.add("fatima");
		al.add(343545);
		al.add(595696.56);
		System.out.println("ListIterator.main()al="+al);
		al.remove(0);
		//
		System.out.println("ListIterator.main()after removigns al=");
		
		System.out.println("ListIterator.main() al="+al);
		Iterator it=al.iterator();
		while(it.hasNext())
		{//map iterator
			Object obj=it.next();//1,2,3
			System.out.println("ListIterator.main() lis="+obj);
		}
		
		for(int i=0;i<al.size();i++)
		{//list ,vector,set
			Object vdd=(Object)al.get(i);
			System.out.println("ListIterator.main() vdd="+vdd);
		}
boolean reslt=	al.contains("fatima");
System.out.println("ListIterator.main() reslt="+reslt);		
HashSet hs=new HashSet();
hs.add("kdkdd");
hs.add("kdkddjsjsj");


Iterator itc=hs.iterator();
		while(itc.hasNext());
		
		
		HashMap<String, Object> hm=new HashMap<String, Object>();
		hm.put("1", "faitma");
		hm.put("5", "kskskskkdd");
		
		



	}
	

	
}
