package com.company.leetcode;

import java.util.Arrays;

public class LeetCode942 {

    //      Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.
    //
    //      Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
    //
    //      If S[i] == "I", then A[i] < A[i+1]
    //      If S[i] == "D", then A[i] > A[i+1]
//    Example 1:
//
//    Input: "IDID"
//    Output: [0,4,1,3,2]
//    Example 2:
//
//    Input: "III"
//    Output: [0,1,2,3]
//    Example 3:
//
//    Input: "DDI"
//    Output: [3,2,0,1]


    public static void main(String[] args) {
        LeetCode942 leetCode942 = new LeetCode942();
        String s = "IDID";
        int result[] = leetCode942.diStringMatch(s);
        System.out.println(Arrays.toString(result));
    }


    public int[] diStringMatch(String S) {
        int result[] = new int[S.length() + 1];
        int max = S.length();
        int min = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                result[i] = min++;
            }
            if (S.charAt(i) == 'D') {
                result[i] = max--;
            }
        }
        result[S.length()] = min;
        return result;
    }

}
