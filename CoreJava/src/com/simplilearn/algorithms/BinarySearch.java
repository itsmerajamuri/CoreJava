package com.simplilearn.algorithms;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[]={1,2,3,5,7,8};
		int low =0;
		int high=data.length-1;
		int loc=-1;
		int se=8;
		int mid=low+high/2;
		
		while(true) {
			System.out.println(low);
			System.out.println(high);
			System.out.println(mid);
			if(se==data[mid]) {
				loc=mid+1;
				break;
			}
			else if(se>data[mid]) {
				low=mid+1;
			}else if(se<data[mid]) {
				high=mid-1;
			}
			mid=low+high/2;
		}
		if(loc==-1) {
			System.out.println("element not found");
		}else {
			System.out.println("element found at "+loc);
		}

	}

}
