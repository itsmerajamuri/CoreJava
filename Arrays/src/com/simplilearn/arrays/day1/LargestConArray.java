package com.simplilearn.arrays.day1;

import java.util.HashSet;

public class LargestConArray {

	public static void main(String[] args) {
		int array[]= {2,3,1,4,10,11,12,13,14,15};
		
		
		
		HashSet<Integer> hashSet=new HashSet<>();
		for(int i=0;i<array.length;i++) {
			hashSet.add(array[i]);
			
		}
		 int largestLength=0;
		for(int i=0;i<array.length;i++) {
			
			if(!hashSet.contains(array[i]-1)) {
				int no=array[i];
				while(hashSet.contains(no)) {
					no++;
				}
				if(no-array[i]>largestLength) {
					largestLength=no-array[i];
				}
			}
		}
		System.out.println("largest cons sequence is : "+largestLength);
		

	}

}
