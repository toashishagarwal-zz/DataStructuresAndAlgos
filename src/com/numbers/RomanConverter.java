package com.numbers;

import java.util.HashMap;
import java.util.Map;

public class RomanConverter {

	public static void main(String[] args) {
		final String input = "XLVIII"; // should give 48
		
		int result = convert(input);
		System.out.println(result);
	}
	
	private static Map<String, Integer> map = new HashMap<String, Integer>();

	static {
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
	}
	
	public static int convert(final String input) {
		Integer arabicNumber = 0;
		
		char[] c = input.toCharArray();
		if(c.length == 1) {
			return map.get(input);
		}
		Integer one = 0, two = 0;
		for(int i =0 ;i<c.length; ) {
			if(i==0) {
				one = map.get(c[0]+"");
				two = map.get(c[1]+"");
			} else {
				one = map.get(c[i] + "");
				if(i+1 < c.length)
					two = map.get(c[i+1] + "");
			}
			
			if(two > one) {
				arabicNumber += (two - one);
				i = i+2;
			} else {
				arabicNumber += one;
				i = i+1;
			}
		}
		return arabicNumber;
	}

}
