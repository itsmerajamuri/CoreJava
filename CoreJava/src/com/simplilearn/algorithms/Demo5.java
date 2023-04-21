package com.simplilearn.algorithms;

  class demo6 extends Demo5{
	  Demo5 method1() {
		  return this;
	  }
	  demo6(){
		  
	  }
	  demo6(Demo5 demo){
		  
	  }
  }

public class Demo5 {
	
	Demo5(){
		demo6 d=new demo6(this);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}

}
