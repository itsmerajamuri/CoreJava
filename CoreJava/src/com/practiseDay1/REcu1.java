package com.practiseDay1;

public class REcu1 {
	static int m(int n) {
		if(n==0) {
			return 1;
		}
		return n+m(n-1);
		
	}

	public static void main(String[] args) {
	System.out.println(m(5));

	}

}
