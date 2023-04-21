package com.simplilearn.arrays.day1;

import java.util.HashMap;
import java.util.Map;

public class AppearOnce {

	public static void main(String[] args) {
		int array[]=new int[] {1,2,1,3,4,4};
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int var:array) {
			 Integer count= map.get(var);
			if(map.get(var)==null) {
				map.put(var, 1);
			}else {
				map.put(var, count+1);
			}
		}
		for(Map.Entry<Integer, Integer> var:map.entrySet()) {
			if(var.getValue()==1) {
				System.out.println(var.getKey());
			}
		}
		

	}

}
