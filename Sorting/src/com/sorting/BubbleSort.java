package com.sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		int array[]=new int[] {12,11,1,2,4,5,6};
		for(int i=0;i<array.length;i++) {
			int temp;
			for(int j=0;j<array.length-1;j++) {
				if(array[j+1]<array[j]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			
		}
		
		for(int s:array) {
			System.out.print(s+" ");
		}
	}

}
