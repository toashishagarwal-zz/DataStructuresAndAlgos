package com.hackerrank.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatingNonRepeating {

	public static void main(String[] args) {
		System.out.println(firstRepeating("abcaab"));	// a
		System.out.println(firstRepeating("abc"));	// Empty char
		
		System.out.println(firstNonRepeating("abcaaeb"));	// c
		System.out.println(firstNonRepeating("abcabc"));	// Empty char
	}

	private static char firstRepeating(String s) {
	   char[] chars = s.toCharArray();
	   Set<Character> set = new HashSet<Character>();

	   for(char c: chars) {
	     if(set.contains(c))
	    	 return c;
	     set.add(c);
	   }	
	  
		return ' ';
	}
	
	private static char firstNonRepeating(String s) {
		char[] chars = s.toCharArray();

	 	Map<Character, Integer> m = new HashMap<Character, Integer>();
		for(char c: chars) {
			if(m.get(c) == null) {
				m.put(c, 1);
			} else {
				m.put(c, m.get(c) + 1);
			}	
		}

		for(char c: chars) {
			if(m.get(c) == 1)
				return c;
		}

		return ' ';
	} 
}
