package com.simplilearn.arrays.day1;

import java.util.HashSet;

public class RemoveDuplicateElementsFromSorted {

	public static void main(String[] args) {
		int array[]= {1,2,1,3,3,1,4,5,5};
		HashSet<Integer> hashSet=new HashSet<>();
		for(int var:array) {
			hashSet.add(var);
		}
		for(Integer var:hashSet) {
			System.out.print(var+" ");
		}

	}

}
