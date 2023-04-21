package com.simplilearn.arrays.day1;


public class SpecialChara {
	public static void main(String[] args) {
		String a="pavan@@#!12345";
		int count=0;
		for(char var:a.toCharArray()) {
			if(Character.isLetterOrDigit(var)==false) {
				count++;
			}
		}
		System.out.println(count);
		a=a.replaceAll("[^A-Za-z0-9]", "");
		System.out.println();
		System.out.println(a);
	}
	
}
