package com;

import java.util.ArrayList;
import java.util.List;

public class ListRemover {

	public static void main(String[] args) {
		
		List<String> a=new ArrayList<String>();
		a.add("abc");
		a.add("pqr");
		a.add("abd");
		
		List<String> b=new ArrayList<String>();
		b.add("xyz");
		b.add("abc");
		System.out.println("ListRemover.main() before a="+a);
		a.removeAll(b);
		System.out.println("ListRemover.main() after b="+a);
		
		
	}
	
	
}
