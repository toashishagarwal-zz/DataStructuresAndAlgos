package com.arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {1,2,4,5,7,9,10};
		System.out.println(binarySearch(a, 7));
		
		int b[] = {1,2,4,5,7,9};
		System.out.println(binarySearch(b, 3));
	}
	
	private static boolean binarySearch(int[] a , int k) {
		int i=0;
		int j= a.length;
		while(i<=j) {
			int mid = (i+j)/2;
			if(a[mid] == k) {
				return true;
			} else if (k > a[mid]) {
				i = mid+1;
			} else {
				j = mid -1;
			}
		}
		return false;
	}
}
