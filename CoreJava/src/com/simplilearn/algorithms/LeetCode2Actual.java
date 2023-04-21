package com.simplilearn.algorithms;

class Link{
	int data;
	Link next;
	
}
class LinkedListEx{
	Link head;
	
	public void addLast(int data) {
		Link n=new Link();
		 n.data=data;
		 n.next=null;
		if(head==null) {
			head=n;
		}
		else 
		{
		   Link current=head;
		   while(current.next!=null) {
			   current=current.next;
		   }
		   current.next=n;
		}
	}
	public int size() {
		Link current=head;
		int count=0;
		while(current!=null) {
			current=current.next;
			count=count+1;
		}
		return count;
	}
	
	public void removeNthNode(int N) {
		if(head==null) {
			System.out.println("head is null");
		}
		else {
			Link n=head;
			for(int i=0;i<size()-N-1;i++) {
				n=n.next;
			}
			n.next=n.next.next;
		}
	}
	public void printElments() {
		Link n=head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
}
public class LeetCode2Actual {

	public static void main(String[] args) {
		
      LinkedListEx ex=new LinkedListEx();
      ex.addLast(1);
      ex.addLast(2);
      ex.addLast(1);
      ex.addLast(2);
      ex.addLast(1);
      ex.addLast(2);
      ex.removeNthNode(5);
      ex.printElments();
	}

}
