package com.simplilearn.algorithms;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
	   HashMap<Character,Integer > hashMap=new HashMap<>();
	   hashMap.put('i', 1);
	   hashMap.put('v', 5);
	   hashMap.put('x', 10);
	   hashMap.put('l', 50);
	   hashMap.put('c', 100);
	   hashMap.put('d', 500);
	   hashMap.put('m', 1000);
	   String a="ivvvvvvvvv";
	   int sum=0;
	  for(int i=0;i<a.length();i++) {
		  if(i>0&& hashMap.get(a.charAt(i))>hashMap.get(a.charAt(i-1))){
			 int in= hashMap.get(a.charAt(i))-2*hashMap.get(a.charAt(i-1));
			  sum+=in;
		  }else {
			 int in= hashMap.get(a.charAt(i));
			 sum=sum+in;
		  }
	  }
	  System.out.println(sum);
	}

}
