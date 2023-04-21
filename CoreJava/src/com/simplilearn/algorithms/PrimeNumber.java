package com.simplilearn.algorithms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// no.divisible by itself and 1
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int i;
		int m=0;
		boolean flag=false;
		
		m=number/2;
		
		if(number==0||number==1) {
			
			
		}else {
			for(i=2;i<=m;i++) {
				if(number%i==0) {
					
					flag=true;
					break;
					
				}
				
			}
			
		}
		if(flag==false) {
			System.out.println("prime number");
		}else {
			System.out.println("not prime number");
		}
		
		if(true) {
			System.out.println("ok");
		}else {
			System.out.println("not ok");
		}
		
		

	}

}
