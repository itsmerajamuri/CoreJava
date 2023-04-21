package com.practiseDay1;

public class Recursion1 {
	int a=10;
	public void one() {
		if(a>=1) {
			System.out.println(a);
			a--;
			
			one();
			System.out.println("hello");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion1 recursion1=new Recursion1();
		recursion1.one();
		

	}

}
