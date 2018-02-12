package com.dynamic;

/**
 * Given 2 string find the min number of edit, delete or add needed to
 * convert one string to another
 * e.g. If str1 = "azced" and str2 = "abcdef" then min distance is 3
 * @author ashish
 *
 */

public class MinEditDistance {

	public static void main(String[] args) {
		String str1 = "azced";
        String str2 = "abcdef";
        
        int minEdits = getMinEditsDynamic(str1.toCharArray(), str2.toCharArray());
        System.out.println(minEdits);
	}

	private static int getMinEditsDynamic(char[] s1, char[] s2) {
		int[][] temp = new int[s1.length + 1][s2.length+1];
		
		// Fill up ROW 0
		for(int i=0; i < temp[0].length; i++){
            temp[0][i] = i;
        }
		
		// Fill up COL 0
		for(int i=0; i < temp.length; i++){
            temp[i][0] = i;
        }
		
		for(int i=1; i<=s1.length; i++){
			for(int j=1 ; j<=s2.length ;j++) {
				if(s1[i-1] == s2[j-1])
					temp[i][j]=temp[i-1][j-1]; // get diagonal value
				else
					temp[i][j] = 1+min(temp[i-1][j-1],temp[i][j-1], temp[i-1][j]);
			}
        }
		
		return temp[s1.length][s2.length];
	}

	private static int min(int i, int j, int k) {
		int t = Math.min(i, j);
		return Math.min(t, k);
	}
}
