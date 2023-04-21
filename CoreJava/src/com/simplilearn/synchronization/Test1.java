package com.simplilearn.synchronization;

import java.util.ArrayList;
import java.util.Iterator;

class Test2{
	int a=10;
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Test2 array[]=new Test2[3];
		array[0]=new Test2();
		array[1]=new Test2();
		array[2]=new Test2();
		for (Test2 test2 : array) {
			System.out.println(test2.a);
			
		}
		ArrayList<Test2> arrayList=new ArrayList<>();
		arrayList.add(new Test2());
		arrayList.add(new Test2());
		arrayList.add(new Test2());
		for (Test2 test2 : arrayList) {
			System.out.println(test2.a);
			
		}
		
		
       
		

	}

}
