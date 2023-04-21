package com.simplilearn.algorithms;

import java.util.ArrayList;
import java.util.List;

class Test2 {
	void method2() {
		System.out.println("hi");
	}
}

interface pavan{
	List<Test1> method1();
}

public class Test1  extends Test2 implements pavan{
	public Test2 method3() {
		Test2 obj=new Test2();
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Test1> method1() {
		// TODO Auto-generated method stub
		List< Test1> obj1=new ArrayList<>();
		Test1 t1=new Test1();
		Test1 t2=new Test1();
		Test1 t3=new Test1();
		obj1.add(t1);
		obj1.add(t1);
		obj1.add(t1);
		return obj1;
		
		
	}
	public Test2 method4() {
		Test1 obj=new Test1();
		return obj;
	}

}
