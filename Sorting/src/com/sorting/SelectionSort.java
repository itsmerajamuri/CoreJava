package com.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[] {11,1,12,4,5,2};
		for(int i=0;i<array.length;i++) {
			int temp;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		for(int a:array) {
			System.out.print(a+" ");
		}
		SelectionSort s=new SelectionSort();
		SelectionSort s1=new SelectionSort();
		System.out.println(s.equals(s1));
		System.out.println(s==s1);

	}

}
