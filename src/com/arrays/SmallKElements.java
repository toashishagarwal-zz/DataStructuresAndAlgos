package com.arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SmallKElements {

	static Integer[] smallK(int[] arr, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return -1 * o1.compareTo(o2);
			}
		});
		
		for(int i= 0 ; i<k ;i++) 
			maxHeap.add(arr[i]);
		
		for(int i=k; i<arr.length;i++)
			addNumber(arr[i], maxHeap);
		
		Integer[] result = new Integer[k];
		maxHeap.toArray(result);
		return result;
	}
	
	private static void addNumber(int number, PriorityQueue<Integer> maxHeap) {
		if(number < maxHeap.peek()) {
			maxHeap.poll();
			maxHeap.add(number);
		}
	}

	public static void main(String[] args) {
		int[] a = {12, 3, 4,1,6,9};
		Integer[] result = smallK(a, 3);
		
		for(Integer i: result)
			System.out.println(i);
	}
}
