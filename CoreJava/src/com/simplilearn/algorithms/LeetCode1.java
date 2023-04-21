package com.simplilearn.algorithms;

public class LeetCode1 {

	public static void main(String[] args) {
		int array[]= {2,11,7,15};
		int target=17;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[j]+array[i]==target) {
					System.out.println("indicesfound at the :"+i+" and "+j);
					break;
				}
			}
		}

	}

}
