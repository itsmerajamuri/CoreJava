package com.simplilearn.algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		int array[]=new int [] {1,2,34,22,11,45,10};
		
		for(int i=0;i<array.length;i++) {
		    int temp;
		    for(int j=0;j<array.length-1;j++) {
		    	if(array[j]>array[j+1]) {
		    		temp=array[j];
		    		array[j]=array[j+1];
		    		array[j+1]=temp;
		    	}
		    }
		}
		for(int var:array) {
			System.out.print(var+",");
		}
		
			
		

	}

}
