package com.solution.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode387 {

    public static void main(String[] args) {
        LeetCode387 leetCode387 = new LeetCode387();
        System.out.println(leetCode387.firstUniqChar("leetcode"));
    }

    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0)
            return -1;
        Map<Character, Integer> charToC = new HashMap();
        for (char ch : s.toCharArray()) {
            charToC.put(ch, charToC.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (charToC.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

}
