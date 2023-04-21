package com.simplilearn.arrays.day1;

public class InsertionSort {

	public static void main(String[] args) {
		int array[]= {5,4,3,2,1};
		for(int i=1;i<array.length;i++) {
			int j=i;
			int temp=array[j];
			while(j>0&&array[j-1]>temp) {
				array[j]=array[j-1];
				j=j-1;
			}
			array[j]=temp;
		}
		for(int var:array) {
			System.out.print(var+" ");
		}

	}

}
