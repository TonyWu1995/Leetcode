package com.solution.leetcode;

public class LeetCode121 {

    public static void main(String[] args) {
        LeetCode121 leetCode121 = new LeetCode121();
        //5
        System.out.println(leetCode121.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        //0
        System.out.println(leetCode121.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    //Time Limit Exceeded // O(n^2)
    public int maxProfit2(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int price = prices[j] - prices[i];
                if (price > result) {
                    result = price;
                }
            }
        }
        return result;
    }

    public int maxProfit(int[] prices) {
        int result = 0;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (max > prices[i]) {
                max = prices[i];
            }
            int price = prices[i] - max;
            if (price > result) {
                result = price;
            }
        }
        return result;
    }

}
