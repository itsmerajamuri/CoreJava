package com.simplilearn.algorithms;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[]= {1,2,3,4,5};
        int se=3;
        int pos=-1;
        for(int i=0;i<array.length;i++) {
        	if(array[i]==se) {
        		pos=i+1;
        		break;
        	}
        }
        if(pos==-1) {
        	System.out.println("element not found");
        }else {
        	System.out.println("element found at : "+pos);
        }
        
	}

}
