package com.simplilearn.algorithms;

public class CommonPrefix {

	public static void main(String[] args) {
		String array[]=new String[] {"pavan","pavan1","pavan2"};
		for(int i=0;i<array.length;i++) {
			String str=array[i];
			String sub1= str.substring(i, i+1);
			for(int j=1;j<array.length;j++) {
				String str1= array[j];
				String sub2= str1.substring(i, i+1);
				if(sub1.equals(sub2)) {
					System.out.println(sub2);
					
				}
			}
		}
		
	}

}
