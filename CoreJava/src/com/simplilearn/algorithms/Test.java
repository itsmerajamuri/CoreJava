package com.simplilearn.algorithms;
class T1{
	static void method1(int a) {
		System.out.println("fine");
		
	}
	int method1(byte a) {
		this.method1((int)a);
		return 1; 
	 }
	 T1(int a){
		 
	 }
	public T1(String string) {
		// TODO Auto-generated constructor stub
	}

}

public class Test extends T1 {
	void method6() {
		a=10;
	}
	 void method9(int a) {
			System.out.println(super.method1((byte)23));
			
		}
	static int a;
	 Test(int a) {
		super("hi");
		
	}




	static void method1() {
		System.out.println("1");
		a=10;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a=29;
		Test test=new Test(a);
		test.method9(a);
		
		

	}

}
