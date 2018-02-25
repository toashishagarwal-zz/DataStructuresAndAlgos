package com.strings;

/** 
 * Find if 2 strings are anagrams.
 * 
 * We have assumed that the char set in those strings is ASCII char set
 * @author ashish
 *
 */

public class Anagrams {

	public static void main(String[] args) {
		System.out.println(isAnagram("cat".toCharArray(), "dog".toCharArray()));  // FALSE
		System.out.println(isAnagram("cat".toCharArray(), "tac".toCharArray()));  // TRUE
	}
	
	private static boolean isAnagram(char[] s1, char[] s2){
		char[] vector = new char[128];
		
		for(char c : s1)
			vector[c]++;
		
		for(char c : s2)
			vector[c]--;
		
		for(int i=0;i<vector.length;i++) {
			if(vector[i]!=0)
				return false;
		}
		
		return true;
	}

}
