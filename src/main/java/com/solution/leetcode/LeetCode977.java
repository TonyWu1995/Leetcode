package com.solution.leetcode;

import java.util.Arrays;

public class LeetCode977 {

//    Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
//
//
//
//    Example 1:
//
//    Input: [-4,-1,0,3,10]
//    Output: [0,1,9,16,100]
//    Example 2:
//
//    Input: [-7,-3,2,3,11]
//    Output: [4,9,9,49,121]


    public static void main(String[] args) {
        LeetCode977 leetCode977 = new LeetCode977();
        int A[] = new int[]{-7,-3,2,3,11};
        int[] result = leetCode977.sortedSquares(A);
        System.out.println(Arrays.toString(result));
    }

    public int[] sortedSquares(int[] A) {
       return Arrays.stream(A).boxed().mapToInt(i->i*i).sorted().toArray();
    }

}
