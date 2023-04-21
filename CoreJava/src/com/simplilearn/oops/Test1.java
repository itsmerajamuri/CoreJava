package com.simplilearn.oops;

public class Test1 implements Comparable<Test1> {
	int id;
	String name;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		

	}
	

	@Override
	public String toString() {
		return "Test1 [id=" + id + ", name=" + name + "]";
	}
	

	public Test1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Test1 o) {
		
		if(name.compareTo(o.name)>0) {
			return 1;
		}else if(name.compareTo(o.name)<0) {
			return -1;
		}else {
			return 0;
		}
	}

	
}
