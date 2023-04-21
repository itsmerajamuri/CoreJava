package com.simplilearn.algorithms;

public class LinearSearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[]=new int[] {1,2,3,2,2,2,23,3,1};
        int loc[]=new int[10];
        int se=2;
        int count=0;
        for(int i=0;i<array.length;i++) {
        	if(array[i]==se) {
        		loc[count]=i+1;
        		count=count+1;
        	}
        }
        if(count==0) {
        	System.out.println("element not found");
        }else {
        	System.out.println("element found at positions :");
        	for(int i=0;i<count;i++) {
        		System.out.println(loc[i]);
        	}
        }
	}

}
