package com.solution.leetcode;

import java.util.Arrays;

public class LeetCode1480 {

    public static void main(String[] args) {
        LeetCode1480 leetCode1480 = new LeetCode1480();
        int[] res = leetCode1480.runningSum(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(res));
    }

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

}
