package com.practiseDay1;

class Test{
	static int b;
	static {
		System.out.println("in test block");
		b=12;
	}
}

public class StaticBlock {
	static {
		a=10;
		System.out.println("hello");
	}
	static int a;

	public static void main(String[] args) {
		
       System.out.println(a);
	}

}
