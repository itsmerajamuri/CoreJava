package com.simplilearn.arrays.day1;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		int array[]=new int[] {1,2,3,4,5,6};
		int min=array[0];
		for(int i=1;i<array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		System.out.println(min);
		
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println(max);


	}

}
