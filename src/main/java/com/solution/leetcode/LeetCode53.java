package com.solution.leetcode;

public class LeetCode53 {

    public static void main(String[] args) {
        LeetCode53 leetCode53 = new LeetCode53();
        int result = leetCode53.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(result);
    }


    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }


}
