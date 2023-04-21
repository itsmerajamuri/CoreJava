package com.simplilearn.algorithms;

public class KadanesAlogorithm {

	public static void main(String[] args) {
		int array[]= {-1,-2,7};
		int max=Integer.MIN_VALUE;
		int currentSum=0;
		for(int i=0;i<array.length;i++) {
			currentSum+=array[i];
			if(currentSum>max) {
				max=currentSum;
			}
			if(currentSum<0) {
				currentSum=0;
			}
		}
		System.out.println(max);

	}

}
