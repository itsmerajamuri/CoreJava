package com.simplilearn.algorithms;

public class AmstrongExample {

	public static void main(String[] args) {
		int a=7;
		int temp=a;
		int sum=0;
		int rem;
		Integer obj=new Integer(a);
		String st= obj.toString();
		System.out.println(st.length());
		for(int i=0;i<a/2;i++) {
			rem=a%10;
			sum=sum+(int)Math.pow(rem, st.length());
			a=a/10;
		}
		if(sum==temp) {
			System.out.println("it is a amstrong number");
		}else {
			System.out.println("it is not a amstrong number");
		}
		
		
		
		
		

	}
	

}
