package com.dynamic;

public class LongestPallindromicSubsequence {

	public static void main(String[] args) {
		 String str = "agbdba";
		 System.out.println(lps(str.toCharArray()));
	}
	
	private static int lps(char[] s){
		int[][] m = new int[s.length][s.length];
		
		// fill in the diagonal with 1s
		for(int i=0;i<s.length;i++)
			m[i][i]=1;
		
		// Process the matrix diagonally
		for(int l = 2; l <= s.length; l++){
            for(int i = 0; i < s.length-l + 1; i++){
                int j = i + l - 1;
                if(l == 2 && s[i] == s[j])
                    m[i][j] = 2;
                else if(s[i] == s[j])
                    m[i][j] = m[i + 1][j-1] + 2;
                else
                    m[i][j] = Math.max(m[i + 1][j], m[i][j - 1]);
            }
		}
		return m[0][s.length-1];
	} 

}
