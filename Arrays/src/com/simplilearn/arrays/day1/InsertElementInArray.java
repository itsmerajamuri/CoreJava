package com.simplilearn.arrays.day1;

public class InsertElementInArray {

	public static void main(String[] args) {
		int array[]= {1,2,34,4};
		
		int insertAtPosition=1;
	
	
		for(int i=array.length-1;i>insertAtPosition-1;i--) {
			array[i]=array[i-1];
			
			
			}
		array[insertAtPosition-1]=10;
		for(int var:array) {
			System.out.println(var);
		}
			

	}

}
