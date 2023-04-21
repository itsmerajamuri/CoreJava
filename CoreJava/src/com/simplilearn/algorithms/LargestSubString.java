package com.simplilearn.algorithms;

import java.util.Scanner;

public class LargestSubString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str= sc.next();
		String value="";
		int max=0;
		char []ch=  str.toCharArray();
		for(char c:ch) {
			//System.out.println(c);
			String value1= String.valueOf(c);
			if(value.contains(value1)) {
				value=value.substring(value.indexOf(value1)+1);
			}
			value=value+value1;
			max=Math.max(max, value.length());
			
			
		}
		
		System.out.println("max : "+max);
		sc.close();
		
		
	}

}
