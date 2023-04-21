package com.simplilearn.arrays.day1;

import java.util.HashSet;

public class FirstDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      int array[]=new int[] {1,2,3,4,4,5};
      for(int i=0;i<array.length;i++) {
    	  int temp=-1;
    	  for(int j=i+1;j<array.length;j++) {
    		 
    		  if(array[i]==array[j]) {
    			
    			  temp=j+1;
    			  System.out.println("first duplicate found at : "+temp);
    			  break;
    			 
    		  }
    		 
    	  }
    	  if(temp>0) {
			break;
		  }
      }
      System.out.println("*********************************************");
      HashSet<Integer> hashSet=new HashSet<>();
      for(int var:array) {
    	  if(hashSet.add(var)==false) {
    		  System.out.println("first duplicate value is : "+var);
    		  break;
    	  }
      }
      
	}

}
