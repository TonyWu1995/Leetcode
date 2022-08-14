package com.solution.leetcode;

public class LeetCode2108 {

    public String firstPalindrome(String[] words) {
        for (String s : words) {
            if (isPalindrome(s)) {
                return s;
            }
        }
        return "";
    }

    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s).reverse();
        return s.equals(stringBuilder.toString());
    }

    public static void main(String[] args) {
        LeetCode2108 leetCode2108 = new LeetCode2108();
        String palindrome = leetCode2108.firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"});
        System.out.println(palindrome);
    }
}
