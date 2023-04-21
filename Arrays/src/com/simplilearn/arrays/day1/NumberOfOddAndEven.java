package com.simplilearn.arrays.day1;

public class NumberOfOddAndEven {

	public static void main(String[] args) {
		int array[]=new int[] {1,2,3,4,5,6};
		int evenCount=0;
		int oddCount=0;
		int sumodeven=0;
		int sumodd=0;
		for(int i=0;i<array.length;i++) {
			
			if(array[i]%2==0) {
				
				
				evenCount++;
				sumodeven=sumodeven+array[i];
			}else {
				oddCount++;
				sumodd=sumodd+array[i];
			}
		}
           System.out.println(evenCount);
           System.out.println(oddCount);
           System.out.println(sumodd);
           System.out.println(sumodeven);
	}

}
