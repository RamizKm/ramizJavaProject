package com.util;

import java.util.ArrayList;
import java.util.List;

public class SubListMain {
	
	public static void main(String[] args) {
		
		new SubListMain().subList();
		
		
		
	}
	
	 public static int BATCH_SIZE=999;
	public void subList() {
		
		List<Integer> subList=new ArrayList<Integer>();
		
		for(int i=1;i<=3;i++) {
			subList.add(i);
		}
		
		
		List<List<Integer>> subbatchList=new ArrayList<List<Integer>>();
		
		int copyEndIndex=0;
		int totalsize=subList.size();
		int copystartIndex=0;
		if(copyEndIndex <=totalsize) {
			int copyEnd=(totalsize < 999 && copystartIndex==0) ?totalsize:BATCH_SIZE;
			
			
			while(copyEnd <=totalsize) {	
				if(copystartIndex >=totalsize) {
					break;
				}
				subbatchList.add(subList.subList(copystartIndex, copyEnd));
				copystartIndex=copyEnd;
			copyEnd=copystartIndex+BATCH_SIZE;
			if(copyEnd >totalsize) {
				copyEnd=totalsize;
			} 
			}
			
		}
		
		for(int i=0;i<subbatchList.size();i++) {
			System.out.println(subbatchList.get(i));
		}
		
	}

}
