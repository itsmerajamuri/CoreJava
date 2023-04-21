package com.simplilearn.arrays.day1;


public class CommonElement3Arrays {

	public static void main(String[] args) {
		
       int array1[]= {22,33,44,1};
       int array2[]= {2,3,22,1};
       int array3[]= {2,3,4,5,22,1};
       for(int i=0;i<array1.length;i++) {
    	   for(int j=0;j<array2.length;j++) {
    		   for(int k=0;k<array3.length;k++) {
    			   if(array1[i]==array2[j]&&array2[j]==array3[k]) {
    				   System.out.println(array1[i]);
    			   }
    		   }
    	   }
       }
       // using 2nd method
       int i=0;
       int j=0;
       int k=0;
       while( i<array1.length&&j<array2.length&&k<array3.length ) {
    	if(array1[i]==array2[j]&&array2[j]==array3[k]) {
    		System.out.println(array1[i]);
    		i++;
    		j++;
    		k++;
    	}else if(array1[i]>array2[j]) {
    		j++;
    	}else if(array2[j]>array3[k]) {
    		k++;
    	}
       }
     
	}
	

}
