package com.solution.leetcode;

import java.util.Arrays;

public class LeetCode242 {

    public static void main(String[] args) {
        LeetCode242 leetcode242 = new LeetCode242();
        System.out.println(leetcode242.isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        int[] number = new int[26];
        for (char c : s.toCharArray()) {
            number[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            number[c - 'a']--;
        }
        for (int i : number) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
