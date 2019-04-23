package com.arrays;

public class DuplicateNumber {

	public static void main(String[] args) {
		final int[] A = {2,0,1,3,3,4};	// Should print 3
		printDupes(A);
		
		final int[] B = {2,0,1,5,3,4};	// Should print "No dupes found"
		printDupes(B);
		
		final int[] C = {2,4,1,3,3,4};	// Should print 3,4
		printDupes(C);
	}
	
	private static void printDupes(final int[] A) {
		int flag = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[Math.abs(A[i])] >= 0)
				A[Math.abs(A[i])] = -A[Math.abs(A[i])];
			else {
				flag = 1;
				System.out.println(Math.abs(A[i]));
			}
		}
		if(flag == 0)
			System.out.println("No dupes found!!");
	}
}
