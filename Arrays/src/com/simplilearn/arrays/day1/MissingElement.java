package com.simplilearn.arrays.day1;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[] {0,1,2,3,4,5,6,7};
		int sum=0;
		int original=0;
		for(int i=1;i<=7;i++) {
			original=original+i;
		}
		System.out.println(original);
		
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		System.out.println(sum);
		if(original-sum==0) {
			System.out.println("no missing number");
		}else {
			System.out.println("missing letter is "+(original-sum));
		}
		

	}

}
