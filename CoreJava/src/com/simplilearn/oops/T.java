package com.simplilearn.oops;

public class T {
int a=10;
	public static void main(String[] args) {
		T t=new T();
		T t1=t;
		t1.a=19;
		t.a=12;
		System.out.println(t1.a);
		

	}

}
