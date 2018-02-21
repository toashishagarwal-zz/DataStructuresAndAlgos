package com.dynamic;

public class UniquePaths {

	public static void main(String[] args) {
		System.out.println(noOfWays(4, 4));
		System.out.println(noOfWays(3, 3));
		System.out.println(noOfWays(3, 4));
	}
	
	private static int noOfWays(int m, int n) {
		int[][] matrix = new int[m][n];
		
		for(int i=0;i<matrix[0].length;i++) 
			matrix[0][i] = 1;
			
		for(int i=0;i<matrix.length;i++) 
			matrix[i][0] = 1;
		
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
			}
		}
		return matrix[m-1][n-1];
	}

}
