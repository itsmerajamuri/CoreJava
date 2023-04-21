package com.simplilearn.oops;
class two{
	int b=10;
}
class one extends two{
	int a=10;
	void method1() {
		System.out.println("hello");
		
		
	}
}

public class Example extends one{
	void method1() {
		System.out.println("hi"+a+b);
	}

	public static void main(String[] args) {
		one one=new one();
		one.method1();

	}

}
