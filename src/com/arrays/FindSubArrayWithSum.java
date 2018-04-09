package com.arrays;

public class FindSubArrayWithSum {

	public static void main(String[] args) {
		int[] a = {1,4,20,3,10,5};
		int K = 33;
		
		findSubArray(a, K);
		
		int[] b = {1,4,0,0,3,10,5};
		int K1 = 7;
		
		findSubArray(b, K1);
		findSubArray(b, 13);
	}

	private static void findSubArray(int[] a, int K) {
		int currSum = a[0];
		int start =0;
		int p=0;

		for(int i=1;i<a.length;i++) {
			while(currSum > K && start < i-1) {
				currSum = currSum - a[start];
				start++;
			}

			if(currSum == K) {
				p = i-1;
				System.out.println(start + "-" + p);
				return;
			}

			if(currSum < K) {
				currSum = currSum + a[i];
			}
		}

		System.out.println("No such subarray found");
	}
}

