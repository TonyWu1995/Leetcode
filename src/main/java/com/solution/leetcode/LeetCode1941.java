package com.solution.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1941 {

    public static void main(String[] args) {
//        "abacbc"
        LeetCode1941 leetCode1941 = new LeetCode1941();
        boolean result = leetCode1941.areOccurrencesEqual("abacbc");
        System.out.println(result);
        result = leetCode1941.areOccurrencesEqual("vvvvvvvvvvvvvvvvvvv");
        System.out.println(result);
    }

    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int first = freq[s.charAt(0) - 'a'];

        for (int num : freq) {
            if (first != num && num != 0) {
                return false;
            }
        }
        return true;
    }
}
