package com.simplilearn.algorithms;

public class SelectionSortExample {

	public static void main(String[] args) {
		int array[]=new int[] {1,245,12,77,11};
		for(int i=0;i<array.length;i++) {
			int temp=-1;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
				   temp=array[i];
				   array[i]=array[j];
				   array[j]=temp;
				}
			}
			
		}
		for(int var:array) {
			System.out.print(var+" , ");
		}
		

	}

}
