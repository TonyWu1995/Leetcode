package com.solution.leetcode;

public class LeetCode122 {

    public static void main(String[] args) {
        LeetCode122 leetCode122 = new LeetCode122();
        //7
        System.out.println(leetCode122.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        //4
        System.out.println(leetCode122.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                result += prices[i] - prices[i - 1];
            }
        }
        return result;
    }

}
