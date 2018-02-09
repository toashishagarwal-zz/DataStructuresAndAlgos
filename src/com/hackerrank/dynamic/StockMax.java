package com.hackerrank.dynamic;

public class StockMax {

	public static void main(String[] args) {
		int[] prices1={1,2,3};
		System.out.println(maxProfit(prices1));
		
		int[] prices2={1,2,100};
		System.out.println(maxProfit(prices2));
		
		int[] prices3={1,3,1,2};
		System.out.println(maxProfit(prices3));
		
		int[] prices4={3,2,1};
		System.out.println(maxProfit(prices4));
	}
	
	private static int maxProfit(int[] prices) {
		int currMax = Integer.MIN_VALUE;
		int profit = 0;
		for(int j=prices.length-1; j>=0 ;j--) {
			if(currMax < prices[j]) {
				currMax = prices[j];
			}
			profit += (currMax - prices[j]);
		}
		
		return profit;
	}

}
