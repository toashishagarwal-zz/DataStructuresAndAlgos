package com.leetcode;

import java.util.Arrays;

/**
 * Given an unsorted array of integers, find the 
 * length of longest increasing subsequence.
 * 
 * NOTE: 
 * 1) We need only the length and not the actual sequence
 * 2) This solution will not give the correct actual sequence
 * 
 * @author ashish
 *
 */

public class LongestIncreasingSubSequence {

	public static void main(String[] args) {
		int[] nums1 = {10,9,2,5,3,7,101,18};
		System.out.println(lengthOfLIS(nums1));
	}

	public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
    }
}
