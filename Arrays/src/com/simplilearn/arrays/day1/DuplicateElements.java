package com.simplilearn.arrays.day1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		int array[]=new int[] {4,3,1,2,3,3,4,3,3,4,5,6,6};
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.println("duplicate element of "+array[i]+" found at position "+(j+1));
				}
			}
		}
		Set<Integer> integer=new HashSet<>();
		for(int var:array) {
			if(integer.add(var)==false) {
				System.out.println(var);
			}
		}
		System.out.println("*****************************");
		
		
		Map<Integer, Integer> map=new HashMap<>();
		
		
		
	for(int var:array) {
		   Integer count= map.get(var);
		   if(count==null) {
			   map.put(var, 1);
		   }else {
			   map.put(var, count+1);
		   }
	}
	
	Set<Entry<Integer, Integer>> map1= map.entrySet();
	for(Map.Entry<Integer, Integer> var:map1 ) {
	//	Integer in= var.getKey();
		//System.out.println(var);
		Integer in1= var.getValue();
		if(in1>3) {
			System.out.println(var.getKey());
			
		}
		
		
	}

}
}