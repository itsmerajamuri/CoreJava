package com.simplilearn.arrays.day1;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int array1[] ={1,2,3};
		int array2[]= {2,3,4,5,6};
		int array3[]=new int[array1.length+array2.length];
		for(int i=0;i<array1.length;i++) {
			array3[i]=array1[i];
		}
		for(int i=0;i<array2.length;i++) {
			array3[array1.length+i]=array2[i];
		}
		for(int var:array3) {
			System.out.println(var);
		}

	}

}
