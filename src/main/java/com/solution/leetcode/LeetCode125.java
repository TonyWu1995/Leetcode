package com.solution.leetcode;

public class LeetCode125 {

    public boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return actual.equals(new StringBuffer().append(actual).reverse().toString());
    }

    public static void main(String[] args) {
        LeetCode125 leetCode125 = new LeetCode125();
        System.out.println(leetCode125.isPalindrome("A man, a plan, a canal: Panama"));
    }

}
