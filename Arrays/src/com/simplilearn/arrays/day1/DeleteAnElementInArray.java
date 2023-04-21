package com.simplilearn.arrays.day1;

public class DeleteAnElementInArray {

	public static void main(String[] args) {
		int array[]= {1,2,3,444,5,56};
		int deleteAtPos=3;
		for(int i=0;i<array.length;i++) {
			if(i==deleteAtPos-1) {
				for(int j=i;j<array.length-1;j++) {
					array[j]=array[j+1];
				}
				break;
			}
		}
		for(int var:array) {
			System.out.println(var);
		}
	}

}
