package com.sorting;

public class REcursion {
	static void m(int n) {
		if(n<=0) {
			return;
		}
		System.out.print(n+" ");
		m(n-2);
		System.out.println(n);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m(7);

	}

}
