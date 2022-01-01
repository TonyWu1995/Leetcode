package com.solution.leetcode;

import java.util.Arrays;

public class LeetCode1313 {

    public static void main(String[] args) {
        LeetCode1313 leetCode1313 = new LeetCode1313();
        System.out.println(Arrays.toString(leetCode1313.decompressRLElist(new int[]{1, 2, 3, 4})));
    }

    public int[] decompressRLElist(int[] nums) {
        int arrLength = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrLength += nums[i];
        }
        int[] result = new int[arrLength];
        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
        return result;
    }

}
