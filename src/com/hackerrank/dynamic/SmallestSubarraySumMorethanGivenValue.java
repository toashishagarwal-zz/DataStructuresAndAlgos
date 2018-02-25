package com.hackerrank.dynamic;

/**
 * Given an int array, find the smallest subarray whose sum is greater than given value X
 * @author ashish
 *
 */

public class SmallestSubarraySumMorethanGivenValue {

	public static void main(String[] args) {
		int[] a = {1,4,45,6,0,19};		//3
		System.out.println(smallestSubArrayWithSum(a, 51));
		
		int[] b = {1,10,5,2,7};		//1
		System.out.println(smallestSubArrayWithSum(b, 9));
	}
	
	private static int smallestSubArrayWithSum(int[] a, int X) {
		int n=a.length;
		int start=0, end=0;
		int currSum=0, minLength=n+1;
		
		while(end < n) {
			while(currSum <= X && end<n) 
				currSum += a[end++];
			
			while(currSum > X && start < n){
				// update min length if needed
				if(end-start < minLength)
					minLength = end - start;
				
				currSum = currSum - a[start++];
			}
		}
		return minLength;
	}

}
