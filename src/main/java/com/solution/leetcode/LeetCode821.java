package com.solution.leetcode;

import java.util.Arrays;

public class LeetCode821 {

    public static void main(String[] args) {
        LeetCode821 leetCode821 = new LeetCode821();
        int[] res = leetCode821.shortestToChar("loveleetcode", 'e');
//        3,2,1,0,1,0,0,1,2,2,1,0
        System.out.println(Arrays.toString(res));
    }

    public int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        Arrays.fill(res, s.length());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                res[i] = 0;
            } else if (i > 0) {
                res[i] = Math.min(res[i], res[i - 1] + 1);
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                res[i] = 0;
            } else if (i < s.length() - 1) {
                res[i] = Math.min(res[i], res[i + 1] + 1);
            }
        }
        return res;
    }
}
