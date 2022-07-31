package com.solution.leetcode;

public class LeetCode680 {

    private boolean checkPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return (checkPalindrome(s, i, j - 1) || checkPalindrome(s, i + 1, j));
            }
            i++;
            j--;
        }

        return true;
    }


    public static void main(String[] args) {
        LeetCode680 leetCode680 = new LeetCode680();
        System.out.println(leetCode680.validPalindrome("abca"));
        System.out.println(leetCode680.validPalindrome("aba"));
    }
}
