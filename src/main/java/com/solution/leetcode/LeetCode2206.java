package com.solution.leetcode;

import java.util.stream.IntStream;

public class LeetCode2206 {

    public static void main(String[] args) {
        LeetCode2206 leetCode2206 = new LeetCode2206();
        System.out.println(leetCode2206.divideArray(new int[]{3, 2, 3, 2, 2, 2}));
        System.out.println(leetCode2206.divideArray(new int[]{1, 2, 3, 4}));
    }


    public boolean divideArray(int[] nums) {
        int[] numArray = new int[501];
        for (int n : nums) {
            ++numArray[n];
        }
        for (int j : numArray) {
            if (j % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
