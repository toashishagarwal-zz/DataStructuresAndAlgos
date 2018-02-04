package com.hackerrank.dynamic;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		System.out.println(maxSumSubarray(a) + " " + maxSumSubsequence(a));
		
		int[] b = {2, -1, 2, 3, 4, -5};
		System.out.println(maxSumSubarray(b) + " " + maxSumSubsequence(b));
		
		int[] c = {1, -16, 15, 23, -53, 75, 80, -24};
		System.out.println(maxSumSubarray(c) + " " + maxSumSubsequence(c));
		
		int[] d = {-1, -2, -3, -4, -5, -6};
		System.out.println(maxSumSubarray(d) + " " + maxSumSubsequence(d));
	}

	
	private static int maxSumSubarray(int[] a) {
		int maxSum = Integer.MIN_VALUE;
		int sumPrev=0;
		for(Integer i : a) {
			if(sumPrev < 0)
				sumPrev=0;
			
			sumPrev += i;
			
			
			if(sumPrev > maxSum) {
				maxSum = sumPrev;
			} 	
		}
		return maxSum;
	}
	
	private static int maxSumSubsequence(int[] a) {
		int maxSumElems = Integer.MIN_VALUE;
		for(Integer elem : a) {
			if(elem > 0) {
				if(maxSumElems < 0)
					maxSumElems = elem;
				else
					maxSumElems += elem;
			} else {
				if(maxSumElems < 0)
					maxSumElems = Math.max(elem, maxSumElems);
			}
		}
		return maxSumElems;
	}
}
