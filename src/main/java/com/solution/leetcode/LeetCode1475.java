package com.solution.leetcode;

import java.util.Arrays;

public class LeetCode1475 {

    public int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            res[i]=prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    res[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode1475 leetCode1475 = new LeetCode1475();
//
        int[] prices = leetCode1475.finalPrices(new int[]{10, 1, 1, 6});
//        [4,2,4,2,3]
        System.out.println(Arrays.toString(prices));
    }

}
