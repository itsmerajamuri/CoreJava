package com.simplilearn.algorithms;

import java.util.Scanner;

public class SubstringExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str= sc.next();
		
		
		int max=0;
		String val="";
		
		for(char c : str.toCharArray()) {
			String ch = String.valueOf(c);//n|a|g|.....
			if(val.contains(ch)) {
				val = val.substring(val.lastIndexOf(ch)+1);
			}
			val = val+ch;
			max = Math.max(max, val.length());
		}
		
		System.out.println("max length "+max);
		sc.close();
		
	}

}
