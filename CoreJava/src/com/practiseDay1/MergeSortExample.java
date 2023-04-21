package com.practiseDay1;

public class MergeSortExample {
	public static void mergesort(int[] array,int lb,int hi) {
		if(lb<hi) {
			int mid=(lb+hi)/2;
			mergesort(array, lb, mid);
			mergesort(array, mid+1, hi);
			merge(array, lb, mid, hi);
			
		}
		
	}
//	static int array1[];
	public static void merge(int[] array,int lb,int mid,int hi) {
		int i=lb;
		int j=mid+1;
		int k=lb;
		int temp[]=new int[array.length];
		while(i<=mid&&j<=hi) {
			if(array[i]>array[j]) {
				temp[k++]=array[j++];
			}else {
				temp[k++]=array[i++];
			}
			
		}
		while(i<=mid) {
			temp[k++]=array[i++];
		}
		while(j<=hi) {
			temp[k++]=array[j++];
		}
		
		for(int l=lb;l<=hi;l++) {
			array[l]=temp[l];
		}
		
		
	}

	public static void main(String[] args) {
		int array[]= {1,2,3,11,8,4,5};
		mergesort(array, 0, array.length-1);
		for(int arr:array) {
			System.out.print(arr+" ");
		}
		
		
		

	}

}
