package com.simplilearn.algorithms;

public class LeetCode3 {

	public static void main(String[] args) {
		String needle="123";
		String haystack="pavan123";
		int sub=-1;
		if(haystack.contains(needle)) {
			sub=haystack.indexOf(needle);
		}
		System.out.println(sub);

	}

}
