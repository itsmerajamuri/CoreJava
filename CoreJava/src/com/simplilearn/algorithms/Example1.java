package com.simplilearn.algorithms;

public class Example1 {

	public static void main(String[] args) {
		//1+2=3,2+3=5,3+5=8
		int a=0;
		int b=1;
		int c;
		/*
		 * for(int i=0;i<10;i++) { c=a+b; System.out.println(a+" + "+b+" = "+c); a=b;
		 * b=c;
		 * 
		 * }
		 */
		
		int bablu=1;
		
		while(bablu>0) {
			c=a+b;
			System.out.println(a+" + "+b+" = "+c);
			a=b;
			b=c;
			bablu++;
			if(bablu==5) {
				break;
			}
			
			
			
		}

	}

}
