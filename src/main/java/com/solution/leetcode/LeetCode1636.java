package com.solution.leetcode;

import java.util.Arrays;

public class LeetCode1636 {

    public static void main(String[] args) {
        LeetCode1636 leetCode1636 = new LeetCode1636();
        System.out.println(Arrays.toString(leetCode1636.frequencySort(new int[]{1, 1, 2, 2, 2, 3})));
        System.out.println(Arrays.toString(leetCode1636.frequencySort(new int[]{2, 3, 1, 3, 2})));
        System.out.println(Arrays.toString(leetCode1636.frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1})));
    }

    public int[] frequencySort(int[] nums) {
        int[] bucket = new int[201];
        for (int i : nums) {
            if (i >= 0) bucket[100 - i]++;
            if (i < 0) bucket[100 + Math.abs(i)]++;
        }
        int index = 0;
        int freq = 1;
        while (index < nums.length) {
            for (int i = 0; i < bucket.length; i++) {
                if (bucket[i] == freq) {
                    while (bucket[i] != 0) {
                        nums[index++] = 100 - i;
                        bucket[i]--;
                    }
                }
            }
            freq++;
        }
        return nums;
    }

}
