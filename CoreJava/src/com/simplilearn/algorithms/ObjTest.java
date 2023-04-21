package com.simplilearn.algorithms;

public class ObjTest {
	int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjTest objTest=new ObjTest();
		ObjTest objTest2=objTest;
		objTest2.a=10;
		System.out.println(objTest.a);
		objTest2.a=10;
		objTest=new ObjTest();
		System.out.println(objTest.a);
		System.out.println(objTest2.a);

		int a=10;
		int b=a;
		a=13;
		


	}

}
