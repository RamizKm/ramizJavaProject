package com.util;

import java.util.ArrayList;
import java.util.List;

public class ListCheck {

	public static void main(String[] args) {
		
		List<String> ct=new ArrayList<String>();
		ct.add("zero");
		
		System.out.println("ListCheck.main() ="+ct);
		
		
		ct.set(0, "zero first");
		
		System.out.println("ListCheck.main() ct="+ct);
		
		
		List<String> ab=new ArrayList<String>();
		ab.add("zero");
		ab.add("first");
		System.out.println("ListCheck.main() ab="+ab);
		
		ab.remove(1);
		System.out.println("ListCheck.main() afterremov ="+ab);
		
		ab.remove(1);
		System.out.println("ListCheck.main() after emov again="+ab);
		
		
		
		System.out.println("ListCheck.main() alist");
		List<String> alist=new ArrayList<String>();
		alist.add("firstzero");
		alist.set(0, "zero");
		System.out.println("ListCheck.main() after zero set");
		System.out.println(alist);
		
	
		
		alist.remove(1);
		System.out.println(alist);
		
		alist.remove(1);
		System.out.println(alist);
	}
	
	
	
}
