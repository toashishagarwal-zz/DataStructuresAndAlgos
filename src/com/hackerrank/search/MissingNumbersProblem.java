package com.hackerrank.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumbersProblem {

	public static void main(String[] args) {
		int[] a = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
		int[] b = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};
		
		int[] result = findMissingNumbers(a, b);
		for(Integer i : result) {
			System.out.println("" + i);
		}
	}
	
	private static int[] findMissingNumbers(int[] arr, int[] brr) {
		Map<Integer, Integer> m1 = populateFrequencies(arr);
		Map<Integer, Integer> m2 = populateFrequencies(brr);
		Set<Integer> set = new TreeSet<Integer>();
        
		int times=0;
		for(java.util.Map.Entry<Integer, Integer> e : m2.entrySet()) {         
			if(m1.get(e.getKey()) != e.getValue()) {    
				while(times < (e.getValue() - m1.get(e.getKey()))) {
					set.add(e.getKey());
					times++;
				}
			}
			times = 0;
		}
        
		// The tree set is converted to int[] bcoz that was the signature given to us in problem statement.
		// Otherwise its not needed
        int[] answer = new int[set.size()];
        int index=0;
        
        for(Integer i : set) 
            answer[index++] = i;
               
        return answer;
	}
	
	private static Map<Integer, Integer> populateFrequencies(int[] a) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(Integer i : a) {
			if(m.get(i) == null)
				m.put(i, 1);
			else
				m.put(i, m.get(i) + 1);
		}
		return m;
	}
}
