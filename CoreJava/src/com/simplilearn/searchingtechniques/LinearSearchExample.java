package com.simplilearn.searchingtechniques;

public class LinearSearchExample {

	public static void search(int arr[], int expected) {
		int temp = -1;
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == expected) {

				temp = i;
				break;

			}

		}
		
		  if(temp==-1) { System.out.println("element is not found"); }else {
		  System.out.println("element found at : "+(temp+1)); }
		  
		 

	}

	public static void main(String[] args) {
		int arr1[] = new int[] { 1, 2, 5, 6, 7, 8, 9, 21 };
		search(arr1, 0);
	}

}
