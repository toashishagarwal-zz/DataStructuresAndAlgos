package com.hackerrank.strings;

public class SeparateNumbers {

	public static void main(String[] args) {
		String s1 = "1234";
		System.out.println("For " + s1 +"\tAnswer -->"  + isBeautiful(s1));
		
		String s2 = "91011";
		System.out.println("For " + s2 +"\tAnswer -->"  + isBeautiful(s2));
		
		String s3 = "99100";
		System.out.println("For " + s3 +"\tAnswer -->"  + isBeautiful(s3));
		
		String s4 = "101103";
		System.out.println("For " + s4 +"\tAnswer -->"  + isBeautiful(s4));
		
		String s5 = "010203";
		System.out.println("For " + s5 +"\tAnswer -->"  + isBeautiful(s5));
		
		String s6 = "13";
		System.out.println("For " + s6 +"\tAnswer -->"  + isBeautiful(s6));
		
		String s7 = "1";
		System.out.println("For " + s7 +"\tAnswer -->"  + isBeautiful(s7));
	}

	private static String isBeautiful(String s1) {
		for(int i=0; i< s1.length()/2;i++){
			long number = Long.parseLong(s1.substring(0, i+1));
			if(isSame(number, s1)) 
				return "YES";
		}
		return "NO";
	}
	
	private static boolean isSame(long number, String s ) {
		StringBuilder sb = new StringBuilder();
		while(sb.length()< s.length()) 
			sb.append(number++);
		return sb.toString().equals(s);
	}
}