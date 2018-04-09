package com.arrays;

public class RepeatedNumber {
	public static void main(String[] args) {
		int[] a = {1,2,3,3,5};
		
		repeatedNumber(a, 5);
	}

	private static void repeatedNumber(int[] a, int n) {
		int x1=a[0];
		
		for(int i=2; i<a.length;i++){
			x1 = x1 ^ a[i];
		}
		System.out.println("missing is -->" + x1);
				
		
	}
}
