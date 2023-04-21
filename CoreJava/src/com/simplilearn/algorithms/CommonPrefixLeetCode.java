package com.simplilearn.algorithms;

import java.util.Collection;
import java.util.*;  


public class CommonPrefixLeetCode {

	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("flight");
		array.add("flower");
		array.add("flew");
		Collections.sort(array,new LengthComparator());
		int min= ((String) array.get(0)).length();
		System.out.println("min length "+min);
		 String str = ((String) array.get(0)).substring(0,1);
		for (int i=0;i<min;i++) {
			 str = ((String) array.get(0)).substring(0,i+1);
			boolean exit=false;
			for(int j=0;j<array.size();j++) {
				if(!((String) array.get(i)).startsWith(str)) {
					str=((String) array.get(0)).substring(0,i);
					exit=true;
					break;
				}
			
			}
			if(exit) 
			{
				break;
			}
		}
		System.out.println("prefix is "+str);
		
	}

}
