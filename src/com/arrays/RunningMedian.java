package com.arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RunningMedian {
	
	public static double[] getMedian(int[] arr) {
		PriorityQueue<Integer> lowers = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return -1 * o1.compareTo(o2);
			}
		});
		
		PriorityQueue<Integer> highers = new PriorityQueue<Integer>();
		
		double[] medians = new double[arr.length];
		for(int i=0; i<arr.length;i++) {
			addNumber(arr[i], lowers, highers);
			rebalance(lowers, highers);
			medians[i] = getMedian(lowers, highers);
		}
		return medians;
	}

	private static double getMedian(PriorityQueue<Integer> lowers,PriorityQueue<Integer> highers) {
		PriorityQueue<Integer> big = (lowers.size() > highers.size()) ? lowers : highers;
		PriorityQueue<Integer> small = (lowers.size() > highers.size()) ? highers : lowers;
		
		if(big.size() == small.size())
			return (double)(big.peek() + small.peek()) /2;
		else 
			return big.peek(); 	
	}

	private static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		PriorityQueue<Integer> big = (lowers.size() > highers.size()) ? lowers : highers;
		PriorityQueue<Integer> small = (lowers.size() > highers.size()) ? highers : lowers;
		
		if(big.size() - small.size() >= 2)
			small.add(big.poll());
	}

	private static void addNumber(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		if(lowers.size() == 0 || number < lowers.peek())
			lowers.add(number);
		else
			highers.add(number);
	}
}
