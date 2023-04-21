package com.practiseDay1;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 implements Comparable<Test1> {
	int price;
	String brandName;
	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	

	
	public Test1(int price, String brandName) {
		super();
		this.price = price;
		this.brandName = brandName;
	}

	public static void main(String[] args) {
		ArrayList<Test1> arrayList=new ArrayList<>();
		arrayList.add(new Test1(0, "a"));
		arrayList.add(new Test1(0, "z"));
		Collections.sort(arrayList);
		for(Test1 var:arrayList) {
			System.out.println(var);
		}
		

	}
	

	@Override
	public int compareTo(Test1 o) {
        if(brandName.compareTo(o.brandName)<0)
        {
        	return 1;
        }

		return -1;
	}

	@Override
	public String toString() {
		return "Test1 [price=" + price + ", brandName=" + brandName + "]";
	}
	

}
