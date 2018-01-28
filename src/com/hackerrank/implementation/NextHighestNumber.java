package com.hackerrank.implementation;

import java.util.Arrays;

/* The given number is 12543 and the resulting next higher number should be 13245. 
We scan the digits of the given number starting from the tenths digit 
(which is 4 in our case) going towards left. At each iteration we check the right 
digit of the current digit we’re at, and if the value of right is greater than 
current we stop, otherwise we continue to left. So we start with current digit 4, right 
digit is 3, and 4>=3 so we continue. 
Now current digit is 5, right digit is 4, and 5>= 4, continue. 
Now current is 2, right is 5, but it’s not 2>=5, so we stop. 
The digit 2 is our pivot digit. From the digits to the right of 2, 
we find the smallest digit higher than 2, which is 3.
This part is important, we should find the smallest higher digit for the 
resulting number to be precisely the next higher than original number. 
We swap this digit and the pivot digit, so the number becomes 13542. 
Pivot digit is now 3. We sort all the digits to the right 
of the pivot digit in increasing order, resulting in 13245. */

public class NextHighestNumber {

	public static void main(String[] args) {

		int n = 8539;
		int answer = nextHighest(n);
		if(answer!=-1)
			System.out.println( n + " and next highest is -->" + answer);
		else
			System.out.println("No such number !!");
	
		n = 12543;
		answer = nextHighest(n);
		if(answer!=-1)
			System.out.println( n + " and next highest is -->" + answer);
		else
			System.out.println("No such number !!");
	}
	
	private static int nextHighest(int n) {
		String s = ""+n;
		int i=-1;
		StringBuilder sb = new StringBuilder();
		char pivot=' ';
		for(i=s.length()-2 ;i>=0;i--) {
			if(s.charAt(i) < s.charAt(i+1)) {
				pivot=s.charAt(i);
				if(sb.length()==0)
					sb.append(s.charAt(s.length()-1));
				else
					sb.append(s.charAt(i+1));
				break;
			} else {
				sb.append(s.charAt(i+1));
			}
		}
		
		if(sb.length() == 0) {   // no such condition occurred, then no number exists
			return -1;
		}
		
		char[] arr = sb.toString().toCharArray();
		Arrays.sort(arr);
		
		for(int j=0 ;j<arr.length;j++) {
			if(arr[j] > pivot) {
				s=s.replace(pivot, arr[j]);
				arr[j]=pivot;
				break;
			}
		}
		
		String result = s.substring(0, i+1) + new String(arr);
		return Integer.parseInt(result);
	}
}
