package com.simplilearn.algorithms;

class demo2{
	static  int a=10;
	static int method(int a) {
	  return	a=a;
		
	}
	
	
	demo2(){
		
	}
	demo2(ThisExample example){
		
	}
	demo2 method1() {
		demo2 d=new demo2();
		return d;
	}
}



public class ThisExample extends demo2 {
      public ThisExample() {
		// TODO Auto-generated constructor stub
    	 demo2 demo=new demo2(this);
	}
      public demo2 method5() {
    	  return this;
    	  
      }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisExample example=new ThisExample();
		System.out.println(example.method5());
		
		
		demo2 obj=new demo2();
		System.out.println(obj.method1());
		System.out.println(obj.method1());
		demo2 obj1=new demo2();

	}

}
