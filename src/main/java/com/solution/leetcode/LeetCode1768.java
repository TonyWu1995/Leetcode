package com.solution.leetcode;

//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
//
//Return the merged string.
//
//
//
//Example 1:
//
//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
//Explanation: The merged string will be merged as so:
//word1:  a   b   c
//word2:    p   q   r
//merged: a p b q c r
//Example 2:
//
//Input: word1 = "ab", word2 = "pqrs"
//Output: "apbqrs"
//Explanation: Notice that as word2 is longer, "rs" is appended to the end.
//word1:  a   b
//word2:    p   q   r   s
//merged: a p b q   r   s
public class LeetCode1768 {

    public static void main(String[] args) {
        LeetCode1768 leetCode1768 = new LeetCode1768();
        String result = leetCode1768.mergeAlternately("abc", "pqr");//apbqcr
        System.out.println(result);
        result = leetCode1768.mergeAlternately("ab", "pqrs");//apbqrs
        System.out.println(result);
    }

    public String mergeAlternately(String word1, String word2) {
        final StringBuilder builder = new StringBuilder();
        int minLength = Math.min(word1.length(), word2.length());
        for (int i = 0; i < minLength; i++) {
            if (i < word1.length()) builder.append(word1.charAt(i));
            if (i < word2.length()) builder.append(word2.charAt(i));
        }
        for (int i = minLength; i < word1.length(); i++) {
            builder.append(word1.charAt(i));
        }
        for (int i = minLength; i < word2.length(); i++) {
            builder.append(word2.charAt(i));
        }
        return builder.toString();
    }

}
