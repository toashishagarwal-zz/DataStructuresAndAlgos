package com.arrays;

import java.util.PriorityQueue;

public class TopKElements {

	static Integer[] topK(int[] arr, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(k);
		
		for(int i= 0 ; i<k ;i++) 
			minHeap.add(arr[i]);
		
		for(int i=k; i<arr.length;i++)
			addNumber(arr[i], minHeap);
		
		Integer[] result = new Integer[k];
		minHeap.toArray(result);
		return result;
	}
	
	private static void addNumber(int number, PriorityQueue<Integer> minHeap) {
		if(number > minHeap.peek()) {
			minHeap.poll();
			minHeap.add(number);
		}
	}

	public static void main(String[] args) {
		int[] a = {12, 3, 4,1,6,9};
		Integer[] result = topK(a, 3);
		
		for(Integer i: result)
			System.out.println(i);
	}
}
