package com.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int array[]=new int[] {1,17,2,23,12,11,10};
		for(int i=1;i<array.length;i++) {
			int key=array[i];
			int j=i-1;
			while(j>=0&array[j]>key) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=key;
		}
		for(int s:array) {
			System.out.print(s+" ");
		}
	}

}
