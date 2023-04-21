package com.simplilearn.synchronization;




public class Test implements Runnable{
	
	
	synchronized public void method1() {
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test();
		Thread t=new Thread(t1);
		t.start();
		
		Thread t2=new Thread(t1);
		t2.start();
		


	}

	@Override
	
	synchronized  public void run() {
	
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
