package com.simplilearn.algorithms;


class demo1{
	demo1 method1() {
		return this;
	}
}
public class Demo extends demo1{
	demo1 method2() {
		
		return this;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d=new Demo();
		demo1 d1= d.method2();
		

	}

}
