package com.dynamic;

public class RodCutting {

	public static void main(String[] args) {
		int[] prices = {2,3,7,8,9};
		int lengthOfRod = 5;
		System.out.println(" Max profit from length " + lengthOfRod + " : " 
							+ calculateProfit(prices, lengthOfRod));
		
		
		int[] prices1 = {1,5,8,9,10,17,17,20};
		int lengthOfRod1 = 8;
		//System.out.println(" Max profit from length " + lengthOfRod1 + " : " 
		//					+ calculateProfit(prices1, lengthOfRod1));
	}

	private static int calculateProfit(int[] prices, int lengthOfRod) {
		int[] solution = new int[lengthOfRod + 1];
		solution[0] = 0;
		
		for(int i = 1; i<= lengthOfRod ;i++) {
			int max = -1;
			for(int j=0 ; j<i; j++) {
				System.out.println("j=" + j + "\t[i - (j+1)] = " + (i - (j+1)));
				max = Math.max(prices[j] + solution [i -(j+1)], max);
				solution[i] = max;	
			}
		}
		return solution[lengthOfRod];	
	}
}
