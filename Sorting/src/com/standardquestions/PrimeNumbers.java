package com.standardquestions;

public class PrimeNumbers {

	public static void main(String[] args) {
		int a=14/2;
		boolean b=true;
		
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				b=false;
				break;
			}
		}
		if(b) {
			System.out.println("prime number");
		}else {
			System.out.println("not a prime number");
		}
		
	}

}
