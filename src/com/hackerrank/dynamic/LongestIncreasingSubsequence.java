package com.hackerrank.dynamic;

import java.util.ArrayList;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] a = {10, 9, 2, 5, 3, 7, 101, 18};
		System.out.println(longestIncSubsequence(a));
			
		System.out.println();
		
		int[] b ={ 1, 12, 7, 0, 23, 11, 52, 31, 61, 69, 70, 2 };
		System.out.println(longestIncSubsequence(b));
	}

	/** USING Binary Search
		for each num in nums
		     if(list.size()==0)
		          add num to list
		     else if(num > last element in list)
		          add num to list
		     else 
		          replace the element in the list which is the smallest but bigger than num
	 * @param a
	 * @return
	 */
	
	private static int longestIncSubsequence(int[] a) {
		// error checking
		if(a.length == 0)
			return 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int num : a) {
			if(list.size() == 0 || num > list.get(list.size() -1))
				list.add(num);
			else {
				int i=0; 
	            int j=list.size()-1;
	            // Binary search
	            while(i<j){
	                int mid = (i+j)/2;
	                if(list.get(mid) < num){
	                    i=mid+1;
	                }else{
	                    j=mid;
	                }
	            }
	 
	            list.set(j, num);
			}
		}
		for(int x : list)
			System.out.print(x + " " );
		System.out.println();
		return list.size();
	}
	
}
