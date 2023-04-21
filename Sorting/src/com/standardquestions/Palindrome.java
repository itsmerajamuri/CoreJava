package com.standardquestions;

public class Palindrome {

	public static void main(String[] args) {
		int number=122;
		int temp=number;
		int reverse=0;
		int rem;
		while(number>0) {
			rem=number%10;
			reverse=10*reverse+rem;
			number=number/10;
		}
		if(reverse==temp) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
