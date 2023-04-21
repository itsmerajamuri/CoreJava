package com.practiseDay1;

public class StringExample {

	public static void main(String[] args) {
		
		int max=0;
		
		
		
		String a="21112";
		for(int i=0;i<a.length();i++) {
			char ch= a.charAt(i);
			
			int count=0;
			for(int j=i;j<a.length();j++) {
				if(ch==a.charAt(j)) {
					count++;
				}
			}
			max=Math.max(max, count);
			System.out.println(max);
		}
		
		

	}

}
