package com.solution.leetcode;

import java.util.Arrays;

public class LeetCode322 {

    public static void main(String[] args) {
//        coins = [1,2,5], amount = 11
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        LeetCode322 leetCode322 = new LeetCode322();
        System.out.println(leetCode322.coinChange(coins, amount));

    }

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (coins == null || coins.length == 0 || amount < 0) {
            return -1;
        }
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int c : coins) {
            for (int i = c; i <= amount; i++) {
                if (dp[i - c] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - c] + 1);
                }

            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

}
