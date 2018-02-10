package com.hackerrank.dynamic;

public class LongestIncreasingSubArray {

	public static void main(String[] args) {
		int[] a  = {5, 6, 3, 5, 7, 8, 9, 1, 2};	 // output should be - 5 {3,5,7,8,9}
		System.out.println(longestIncSubArray(a));
	
		int[] b= {12, 13, 1, 5, 4, 7, 8, 10, 10, 11}; // output should be - 4 {4, 7, 8, 10}
		System.out.println(longestIncSubArray(b));
	}
	

	private static int longestIncSubArray(int[] a) {
		int max=Integer.MIN_VALUE;
		int len=1;
		
		for(int i=1;i<a.length;i++) {
			if(a[i] > a[i-1]) {
				len++;
			} else {
				if(max < len)
					max = len;
				len=1;
			}
		}
		
		if(max < len)
			max = len;
		
		return max;
	} 
	
}
