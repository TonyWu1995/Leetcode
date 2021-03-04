package com.solution.leetcode;

//Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
//
//A string is represented by an array if the array elements concatenated in order forms the string.
//
//
//
//Example 1:
//
//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//Output: true
//Explanation:
//word1 represents string "ab" + "c" -> "abc"
//word2 represents string "a" + "bc" -> "abc"
//The strings are the same, so return true.
public class LeetCode1662 {

    public static void main(String[] args) {
        LeetCode1662 leetCode1662 = new LeetCode1662();
        boolean result = leetCode1662.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"});
        System.out.println(result);
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        final StringBuilder builder1 = new StringBuilder();
        for (String s : word1) {
            builder1.append(s);
        }
        final StringBuilder builder2 = new StringBuilder();
        for (String s : word2) {
            builder2.append(s);
        }
        return builder1.toString().equals(builder2.toString());
    }

}
