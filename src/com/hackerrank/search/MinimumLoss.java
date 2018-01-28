package com.hackerrank.search;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumLoss {

	public static void main(String[] args) {
		long[] prices1 = {5, 10, 3};
		System.out.println(findMinLoss(prices1));

		long[] prices2 = {20,7,8,2,5};
		System.out.println(findMinLoss(prices2));
	}
	
	private static int findMinLoss(long[] prices) {
		 int size = prices.length;
		long min=Long.MAX_VALUE;
		HashMap<Long,Integer> indices = new HashMap<>();
        
        for(int i = 0; i < size; i++){
            indices.put(prices[i],i);
        }
        
        Arrays.sort(prices);
        
        for(int i = size-1; i >0; i--){
            //Make sure it is a smaller loss
            if(prices[i]-prices[i-1] < min){
                //Verify if the pair is a valid transaction
                if(indices.get(prices[i]) < indices.get(prices[i-1]))
                    min = prices[i]-prices[i-1];
            }
        }
        
		return (int)min;
	}
}
