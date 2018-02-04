package com.hackerrank.dynamic;

import java.math.BigInteger;

public class ModifiedFibo {

	public static void main(String[] args) {
		int n=5, t1=0, t2=1;
		//System.out.println(getFibo(t1, t2, n));	
		
		n=10; t1=0 ; t2=1;
		getFibo(t1, t2, n);	
	}
	
	private static void getFibo(int t1, int t2, int n) {
		BigInteger[] memo= new BigInteger[n];
		
		memo[0]=BigInteger.valueOf(t1);
		memo[1]=BigInteger.valueOf(t2);
		
		for(int i=2; i<n; i++)
			memo[i] = memo[i-2].add(memo[i-1].multiply(memo[i-1]));
		
		System.out.println(memo[n-1]);
		
		//return memo[n-1];
	}
	
}
