package com.standardquestions;

public class AmstrongNumber {

	public static void main(String[] args) {
		int no=153;
		String n= Integer.toString(no);
		int length=n.length();
		double sum=0;
		
		for(int i=0;i<length;i++) {
		sum=sum+Math.pow(n.charAt(i), (double)length);
		System.out.println(sum);
		
		}
		if(sum==no) {
			System.out.println("amstrong number");
		}else {
			System.out.println("not a amstrong number");
		}
		
	}
}
