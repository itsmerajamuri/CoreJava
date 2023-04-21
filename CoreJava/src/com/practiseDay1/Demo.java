package com.practiseDay1;

public class Demo {

	int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Demo demo=new Demo();
      demo.a=12;
      Demo demo2=demo;
      demo2.a=13;
      System.out.println(demo.a);
      
	}

}
