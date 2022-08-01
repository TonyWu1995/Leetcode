package com.solution.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode392 {

    public static void main(String[] args) {
        LeetCode392 leetCode392 = new LeetCode392();
        boolean result = leetCode392.isSubsequence("axc", "ahbgdc");
        System.out.println(result);
    }

    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (int j = 0; j < t.length() && i < s.length(); j++) {
            if (t.charAt(j) == s.charAt(i)) {
                i++;
            }
        }
        return i == s.length();
    }

}
