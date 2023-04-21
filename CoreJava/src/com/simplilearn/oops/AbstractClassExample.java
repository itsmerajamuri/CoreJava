package com.simplilearn.oops;


class bablu4{
	public void method2() {
		
	}
	public void method6() {
		
	}
}

  abstract class bablu extends bablu4{
	 public void method1() {
		 System.out.println("bablu");
	 }
	 public abstract void method2();
	 
 }
  abstract class bablu1 extends bablu{
	  public abstract void method2();
	 
	  
	  
  }
  class bablu3 extends bablu1{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	  
	  

  }

	  
 


public  class AbstractClassExample extends bablu{
	public void m1() {
		
	}

	public static void main(String[] args) {
	
		 
		AbstractClassExample abstractClassExample=new AbstractClassExample();
		abstractClassExample.m1();
		
		
		

	}

	
	public void method2() {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		
	}

}
