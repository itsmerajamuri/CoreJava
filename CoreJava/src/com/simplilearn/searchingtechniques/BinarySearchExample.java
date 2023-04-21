package com.simplilearn.searchingtechniques;

public class BinarySearchExample {
	public static void search(int arr[],int expected) {
	
		int low =0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		while(low<=high) {
			if(arr[mid]==expected) {
			
				break;
			}else if(arr[mid]>expected) {
				high=mid-1;
				
			}else {
				low=mid+1;
				
			}
			mid=(low+high)/2;
		}
		if(low>high) {
			System.out.println("element not found  ");

		}else { 
			System.out.println("element  found at position "+(mid+1));

		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,23,45,67};
		search(array, 4);
		

	}

}
