package com.solution.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode961 {

//    In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
//
//    Return the element repeated N times.
//
//
//
//    Example 1:
//
//    Input: [1,2,3,3]
//    Output: 3
//    Example 2:
//
//    Input: [2,1,2,5,3,2]
//    Output: 2
//    Example 3:
//
//    Input: [5,1,5,2,5,3,5,4]
//    Output: 5


    public static void main(String[] args) {
        LeetCode961 leetCode961 = new LeetCode961();
        int A[] = new int[]{1, 2, 3, 3};
        int result = leetCode961.repeatedNTimes(A);
        System.out.println(result);
    }

    public int repeatedNTimes(int[] A) {
        Set<Integer> repeatSet = new HashSet<>();
        for (int i : A) {
            if (repeatSet.contains(i)) {
                return i;
            }
            repeatSet.add(i);
        }
        throw null;
    }


}
