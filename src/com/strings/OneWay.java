package com.strings;

public class OneWay {

	public static void main(String[] args) {
		System.out.println(isOneCharChange("pale", "ple"));
		System.out.println(isOneCharChange("pales", "pale"));
		System.out.println(isOneCharChange("pale", "bale"));
		System.out.println(isOneCharChange("pale", "bake"));
	}
	
	public static boolean isOneCharChange(String s1, String s2) {
		if(Math.abs(s1.length() - s2.length()) == 1 ) {  	// Insert/delete case
			return checkInsertDelete(s1, s2);
		} else if (s1.length() == s2.length()) { 			// replace case
			return checkReplace(s1, s2);
		}
		return false;
	}

	private static boolean checkReplace(String s1, String s2) {
		return manipulateStrings(s1, s2);
	}

	private static boolean checkInsertDelete(String s1, String s2) {
		String big=null, small=null;
		if(s1.length() > s2.length()) {
			big = s1;
			small = s2;
		} else {
			big = s2;
			small = s1;
		}
		return manipulateStrings(big, small);
	}
	
	private static boolean manipulateStrings(String s1, String s2) {
		StringBuffer sb = new StringBuffer(s1);
		for(int i=0 ;i<s2.length();i++) {
			if(sb.indexOf(s2.charAt(i)+"")>= 0){
				sb.deleteCharAt(sb.indexOf(s2.charAt(i)+""));
			}
		}
		return sb.length() == 1;
	}
}
