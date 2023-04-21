package com.simplilearn.algorithms;


public class ReverseString{
    

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="bb";
		String reverse ="";
		for(int i=original.length()-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		System.out.println(reverse);
		if(reverse.equals(original)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
		
		
	
		
		
		
		

	}

}
