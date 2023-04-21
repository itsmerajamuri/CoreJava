package com.practiseDay1;

public class MergeSortPrac {
	
	static void sort(int[] array,int li,int hi) {
		
		if(li<hi) {
			int mid=(li+hi)/2;
			sort(array, li, mid);
			sort(array, mid+1, hi);
			merge(array,li, mid, hi);
		}
	}
	static void merge(int[] array,int li,int mid,int hi) {
         
		
	}
	
	public static void main(String[] args) {
		
	}

}
