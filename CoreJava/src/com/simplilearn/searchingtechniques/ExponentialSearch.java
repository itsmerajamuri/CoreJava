package com.simplilearn.searchingtechniques;

import java.util.Arrays;

public class ExponentialSearch {
	public static boolean search(int arr[],int expected) {
	if(arr[0]==expected) {
		return true;
	}
	int i=1;
	while(i<arr.length&&arr[i]<=expected) {
		i*=2;
	}
	int array= Arrays.binarySearch(arr, i/2, Math.min(i,arr.length-1), expected);
	if(array>=0) {
		return true;
	}
	else {
		return false;
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,45,56};
		System.out.println(search(array, 21));

	}

}
