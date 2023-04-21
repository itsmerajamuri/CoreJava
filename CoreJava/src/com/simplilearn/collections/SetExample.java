package com.simplilearn.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<test> integers=new HashSet<>();
		integers.add(new test());
		integers.add(new test());
		integers.add(null);
		System.out.println(integers);
		Iterator< test> it=integers.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		TreeSet<test> integers1=new TreeSet<>();
		integers1.add(new test());
		integers1.add(new test());
		//integers1.add(null);
		Iterator< test> it1=integers1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}

	}

}
