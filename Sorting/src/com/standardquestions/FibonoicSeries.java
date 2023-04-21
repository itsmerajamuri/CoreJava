package com.standardquestions;

public class FibonoicSeries {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=a+b;
	    for(int i=0;i<15;i++) {
	    	System.out.println(a+" "+b+" "+c);
	    	a=b;
	    	b=c;
	    	c=a+b;
	    	
	    }

	}

}
