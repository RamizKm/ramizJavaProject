package rkm.april19;

import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList<String> llst=new LinkedList<String>();
		llst.add("baner");
		llst.add("katraj");
		llst.add("hadapsar");
		llst.add("manjri");
		
		for(String str:llst) {
			System.out.println("LinkedListTest.main() str="+str);
		}
		
		llst.addFirst("hinjewadi");
		llst.addLast("kharadi");
		
		System.out.println("LinkedListTest.main() traversing list**************");
		for(String str:llst) {
			System.out.println("LinkedListTest.main() str="+str);
		}
		
	}

}
