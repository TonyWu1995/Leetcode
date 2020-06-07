package com.solution.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode561 {

//    Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
//
//    Example 1:
//    Input: [1,4,3,2]
//
//    Output: 4
//    Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).

    public static void main(String[] args) {
        LeetCode561 leetCode561 = new LeetCode561();

        int nums[] = new int[]{1, 4, 3, 2};
        int result = leetCode561.arrayPairSum(nums);
        System.out.println(result);
    }

    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }

}
