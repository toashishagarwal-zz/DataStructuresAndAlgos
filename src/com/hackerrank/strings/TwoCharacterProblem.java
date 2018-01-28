package com.hackerrank.strings;

public class TwoCharacterProblem {

	public static void main(String[] args) {
		System.out.println(isValid("xyxy"));
		System.out.println(isValid("xyxyx"));
		System.out.println(isValid("yxyxy"));
		System.out.println(isValid("xyxb"));
	}
	
	private static boolean isValid(String s) {
		char one = s.charAt(0);
		char two = s.charAt(1);
		StringBuffer sb = new StringBuffer();
		
		while(sb.length() < s.length()) {
			sb.append(one);
			if(sb.length() == s.length())
				break;
			sb.append(two);
		}
		return sb.toString().equals(s);
	}
}
