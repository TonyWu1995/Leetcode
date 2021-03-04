package com.solution.leetcode;

//Given a string s formed by digits ('0' - '9') and '#' . We want to map s to English lowercase characters as follows:
//
//Characters ('a' to 'i') are represented by ('1' to '9') respectively.
//Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
//Return the string formed after mapping.
//
//It's guaranteed that a unique mapping will always exist.
//
//
//
//Example 1:
//
//Input: s = "10#11#12"
//Output: "jkab"
//Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
//Example 2:
//
//Input: s = "1326#"
//Output: "acz"
public class LeetCode1309 {

    public static void main(String[] args) {
        LeetCode1309 leetCode1309 = new LeetCode1309();
        String result = leetCode1309.freqAlphabets("10#11#12"); //jkab
        System.out.println(result);
    }


    public String freqAlphabets(String s) {
        final StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                sb.append((char) ('a' + (s.charAt(i - 1) - '0') + 10 * (s.charAt(i - 2) - '0') - 1));
                i -= 2;
            } else {
                sb.append((char) ('a' + s.charAt(i) - '0' - 1));
            }
        }
        sb.reverse();
        return sb.toString();
    }

}
