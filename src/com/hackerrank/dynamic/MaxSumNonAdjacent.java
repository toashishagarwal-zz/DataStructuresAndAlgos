package com.hackerrank.dynamic;

/**
 * UBER question
 * 
 * Given an int array of positive ints, find the largest sum of non adjacent elements
 * e.g. For input = 4 1 1 4 2 1, answer = 4+4+1=9 
 * 
 * @author ashish
 *
 */

public class MaxSumNonAdjacent {

	public static void main(String[] args) {
		int[] a = {4, 1, 1, 4, 2, 1};		// 9
		System.out.println(maxSumNonAdjacent(a));
			
		int[] b = {2,5,3,1,7};		// 12
		System.out.println(maxSumNonAdjacent(b));
		
		int[] c = {1, 0, 3, 9, 2};	// 10
		System.out.println(maxSumNonAdjacent(c));
	}
	
	private static int maxSumNonAdjacent(int[] a) {
		int including=a[0], 
			excluding=0;
		
		int temp=0;
		for(int i=1;i<a.length;i++) {
			temp = including;
			including = Math.max(including, excluding+a[i]);
			excluding = temp;
		}
		return including;
	}
}


