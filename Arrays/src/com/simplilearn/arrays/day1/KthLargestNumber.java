package com.simplilearn.arrays.day1;

public class KthLargestNumber {

	public static void main(String[] args) {
int array[]=new int[] {1,2,3,4,5};
       
         
		int kthlargest=3;
		
	    for(int i=0;i<array.length;i++) {
	    	for(int j=i+1;j<array.length;j++) {
	    		int temp=0;
	    		if(array[i]<array[j]) {
	    			temp=array[i];
	    			array[i]=array[j];
	    			array[j]=temp;
	    		}
	    		
	    	}
	    	if(i==kthlargest-1) {
	    		System.out.println(array[i]);
	    		break;
	    	}
	    }
		int kthsmallest=1;
		int temp1;
	    for(int i=0;i<array.length;i++) {
	    	for(int j=i+1;j<array.length;j++) {
	    		if(array[i]>array[j]) {
	    			temp1=array[i];
	    			array[i]=array[j];
	    			array[j]=temp1;
	    		}
	    		
	    	}
	    	if(i==kthsmallest-1) {
	    		System.out.println(array[i]);
	    		break;
	    	}
	    }
		

	}

}
