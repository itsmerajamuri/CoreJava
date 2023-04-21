package com.simplilearn.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class test implements Comparable<test>{
	int a=10;
	int b=21;

	
	public int compareTo(test o) {
		// TODO Auto-generated method stub
		if(a>o.b) {
			return 1;
		}
		else {
			return -1;
		}
			
		
		
	}
}

public class ArrayListExample {

	public static void main(String[] args) {
		List<test> integers=new ArrayList<>();
		integers.add(new test());
		for (test integer : integers) {
			System.out.println(integer.a);
		}
		Iterator<test> it= integers.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().a=12);
			
		}
		LinkedList<test> ll=new LinkedList<>();
		ll.add(new test());
		ll.add(new test());
		ll.add(null);
		for (test test : ll) {
			System.out.println(test);
		}
		Stack<Integer> stack=new Stack<>();
		stack.add(1);
		stack.add(3);
		stack.add(2);
		System.out.println(stack.pop()+"removed");
		stack.push(2);
		System.out.println(stack.peek()+"top");
		
		for (Integer test : stack) {
			System.out.println(test);
		}
		
		
		

	}
	

}
