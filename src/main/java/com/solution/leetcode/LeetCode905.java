package com.solution.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode905 {

//    Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
//
//    You may return any answer array that satisfies this condition.
//
//
//
//    Example 1:
//
//    Input: [3,1,2,4]
//    Output: [2,4,3,1]
//    The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.


    public static void main(String[] args) {
        LeetCode905 leetCode905 = new LeetCode905();
        int A[] = new int[]{3, 1, 2, 4};
        int[] result = leetCode905.sortArrayByParity(A);
        System.out.println(Arrays.toString(result));
    }

    public int[] sortArrayByParity(int[] A) {
        return Arrays.stream(A).boxed().sorted(Comparator.comparingInt(a -> a % 2))
                .mapToInt(i -> i)
                .toArray();
    }


}
