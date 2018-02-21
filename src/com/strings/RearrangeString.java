package com.strings;

import java.util.Arrays;

/**
 * Facebook Q
 * 
 * Given a string containing uppercase alphabets and integer digits (from 0 to 9), 
 * the task is to print the alphabets in the order followed by the sum of digits.
 * 
 * e.g AC2BEW3 => ABCEW5
 * @author ashish
 *
 */

public class RearrangeString {

	public static void main(String[] args) {
		System.out.println(rearrange("AC2BEW3"));        // ABCEW5
		System.out.println(rearrange("ACCBA10D2EW30"));  // AABCCDEW6
	}
	
	private static String rearrange(String input) {
		char[] chars = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		int sum=0;
		
		Arrays.sort(chars);
		for(char c: chars) {
			if((c-'0'>=0) && (c-'0'<=9))
				sum+=c-'0';
			else 
				sb.append(c);
		}
		sb.append(sum);
		return sb.toString();
	} 

}
