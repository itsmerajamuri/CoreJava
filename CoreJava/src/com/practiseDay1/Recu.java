package com.practiseDay1;

public class Recu {
	static int m(int n) {
		if (n == 0) {
			return 1;
		}
		System.out.println(n);
		int val = n * m(n - 1);
		System.out.println("n " + n);
		System.out.println("factorial " + val);
		return val;
	}

	public static void main(String[] args) {

		m(5);

	}

}
