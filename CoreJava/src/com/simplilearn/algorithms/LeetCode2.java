package com.simplilearn.algorithms;

class Node{
	int data;
	Node next;
}
class LinkedList{
	Node head;

	
	public void insertFirst(int data) 
	{
		Node n=new Node();
		if(head==null) {
			n.data=data;
			n.next=null;
			 head=n;
	        
		}else {
			n.data=data;
			n.next=head;
			head=n;	
		}
	}
public void insertLast(int data) 
{
	Node n=new Node();
	n.data=data;
	n.next=null;
	if(head==null) {
		head=n;
	}else {
		Node current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=n;
	}		
}
   public void insertAt(int index,int data) {
	   Node n=new Node();
	   n.data=data;
	  
	   Node current=head;
	   
	   for(int i=0;i<index-1;i++) {
		   current=current.next;
	   }
	   n.next=current.next;
	   current.next=n;	   
   }
   
	public void printElements() {
		Node n1=head;
		while(n1!=null) {
			System.out.print(n1.data+" ");
			n1=n1.next;
		}
	}
	public int size() {
		Node n=head;
		int count=0;
		while(n!=null) {
			n=n.next;
			count=count+1;
		}
		return count;
	}
	
}

public class LeetCode2 {

	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		linkedList.insertFirst(10);
		linkedList.insertFirst(5);
		linkedList.insertFirst(2);
		linkedList.insertLast(15);
		linkedList.insertLast(11);
		linkedList.insertLast(19);
		linkedList.insertAt(3, 122);
		System.out.println(linkedList.size());

		linkedList.printElements();

		
	}

}
