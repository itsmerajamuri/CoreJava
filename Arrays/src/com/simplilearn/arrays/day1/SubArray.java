package com.simplilearn.arrays.day1;

public class SubArray {
	

	public static void main(String[] args) {
		int array[]= {-1,109,110,11,-111,888};
		int max=Integer.MIN_VALUE;
		
		
		
		for(int i=0;i<array.length;i++) {
		int subArray=0;
			for(int j=i;j<array.length;j++) {
				subArray=subArray+array[j];
				if(subArray>max) {
					max=subArray;
				}
				
			}
		}
		System.out.println(max);
	}

}
