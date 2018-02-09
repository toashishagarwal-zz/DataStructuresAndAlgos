package com.hackerrank.dynamic;

/**
 * You are given an infinite supply of coins of different denominations
 * and an amount. You need to find no. of ways to mix and match the coins 
 * to make the amount.
 * 
 * 'No. of ways' means its a dynamic programming problem. Hence we need a 
 * formula first
 * 
 * In this the formula is -
 * combos[i] += combos[i-coin]
 * 
 * @author ashish
 *
 */

public class CoinExchange {
	public static void main(String[] args) {
		int[] coins = {1,2,3,5};
		int amt = 8;
		System.out.println(getWays(coins, amt));
		
		int[] coins1 = {1,2,3};
		int amt1 = 4;
		System.out.println(getWays(coins1, amt1));
		
		int[] coins2 = {2,3,6,5};
		int amt2 = 10;
		System.out.println(getWays(coins2, amt2));
	}

	private static int getWays(int[] coins, int amt) {
		int[] combos = new int[amt +1];
		combos[0] = 1;
		
		for(Integer coin : coins) {
			for(int i =1 ;i<combos.length;i++) {
				if(i>=coin) {
					combos[i] += combos[i-coin];
				}
			}
		}
		return combos[amt];
	}
}
