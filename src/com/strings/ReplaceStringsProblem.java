package com.strings;

public class ReplaceStringsProblem {

	public static void main(String[] args) {
		System.out.println(replace("Oh My God   ", ' ', "%20"));
		System.out.println(replace("OhMyGod", ' ', "%20"));
	}
	
	public static String replace(String s, char from, String to) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i< s.length() ;i++) {
			if(s.charAt(i) == from) 
				sb.append(to);
			else
				sb.append(s.charAt(i));
		}
		return sb.toString();
	}

}
