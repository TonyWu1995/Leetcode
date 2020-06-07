package com.leetcode;

import java.util.Arrays;

public class Squares_of_a_Sorted_Array {
//Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
//
//
//
//Example 1:
//
//Input: [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Example 2:
//
//Input: [-7,-3,2,3,11]
//Output: [4,9,9,49,121]
//
//
//Note:
//
//1 <= A.length <= 10000
//-10000 <= A[i] <= 10000
//A is sorted in non-decreasing order.

    public static void main(String[] args) {
        Squares_of_a_Sorted_Array squares_of_a_sorted_array = new Squares_of_a_Sorted_Array();
        int[] squares = squares_of_a_sorted_array.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        System.out.println(Arrays.toString(squares));
    }

    public int[] sortedSquares(int[] A) {
        return Arrays.stream(A).map(i -> i * i).sorted().toArray();
    }

}
