package com.simplilearn.arrays.day1;

public class SecondLargestNumber {
	static int b;

	public static void main(String[] args) {
		int array[]=new int[] {1,2,3,4,5};
		
		int temp;
	    for(int i=0;i<array.length;i++) {
	    	for(int j=i+1;j<array.length;j++) {
	    		if(array[i]<array[j]) {
	    			temp=array[i];
	    			array[i]=array[j];
	    			array[j]=temp;
	    		}
	    		
	    	}
	    	if(i==1) {
	    		System.out.println(array[i]);
	    		break;
	    	}
	    }
		
		

	}

}
