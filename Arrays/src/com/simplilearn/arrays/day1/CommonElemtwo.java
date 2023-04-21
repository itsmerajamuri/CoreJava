package com.simplilearn.arrays.day1;

public class CommonElemtwo {

	public static void main(String[] args) {
		int array1[]= {1,2,3,4,5,11};
		int array2[]= {6,7,8,9,10,11,11};
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					System.out.println(array1[i]);
					break;
				}
			}
		}

	}

}
