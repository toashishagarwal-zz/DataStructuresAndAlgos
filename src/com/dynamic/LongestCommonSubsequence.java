package com.dynamic;

/**
 * Given 2 String inputs find the longest common subsequence
 * @author ashish
 *
 */

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		System.out.println(longCommonSub("bqdrcvefgh", "abcvdefgh"));	//bcvefgh=7
	}
	
	private static int longCommonSub(String s1, String s2) {
		int rows = s1.length() + 1;
		int cols = s2.length() + 1;
		int[][] matrix = new int[rows][cols];
		
		// fill in zeroes
		for(int i=0;i<cols;i++)
			matrix[0][i]=0;
		
		for(int i=0;i<rows;i++)
			matrix[i][0]=0;
		
		for(int i=1;i<rows;i++){
			for(int j=1;j<cols;j++){
				if(s1.charAt(i-1) == s2.charAt(j-1))
					matrix[i][j]= 1 + matrix[i-1][j-1];
				else
					matrix[i][j]= Math.max(matrix[i-1][j], matrix[i][j-1]);
				
			}
		}
		return matrix[rows-1][cols-1];
	} 
	
	static void printMatrix(int[][] m) {
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[0].length;j++){
				System.out.print(m[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	
}
