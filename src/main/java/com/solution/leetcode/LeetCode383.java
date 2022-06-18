package com.solution.leetcode;

import java.util.Arrays;

public class LeetCode383 {

    public static void main(String[] args) {
        LeetCode383 leetCode383 = new LeetCode383();
        //false
        System.out.println(leetCode383.canConstruct("a", "b"));
        //false
        System.out.println(leetCode383.canConstruct("aa", "ab"));
        //true
        System.out.println(leetCode383.canConstruct("aa", "aab"));
        //true
        System.out.println(leetCode383.canConstruct("aab", "baa"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
