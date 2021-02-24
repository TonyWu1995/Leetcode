package com.solution.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode1684 {
    //    You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
//
//Return the number of consistent strings in the array words.
//
//
//
//Example 1:
//
//Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
//Output: 2
//Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
//Example 2:
//
//Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
//Output: 7
//Explanation: All strings are consistent.
//Example 3:
//
//Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
//Output: 4
//Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
//
//
//Constraints:
//
//1 <= words.length <= 104
//1 <= allowed.length <= 26
//1 <= words[i].length <= 10
//The characters in allowed are distinct.
//words[i] and allowed contain only lowercase English letters.
    public static void main(String[] args) {
        final LeetCode1684 leetCode1684 = new LeetCode1684();
        int result = leetCode1684.countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"});
        System.out.println(result);//2
    }

    public int countConsistentStrings(String allowed, String[] words) {
        final Set<Character> letters = new HashSet<>(allowed.length());
        for (char letter : allowed.toCharArray()) {
            letters.add(letter);
        }
        int count = 0;
        for (String word : words) {
            boolean consistent = true;
            for (char letter : word.toCharArray()) {
                if (!letters.contains(letter)) {
                    consistent = false;
                    break;
                }
            }
            if (consistent)
                count++;
        }
        return count;
    }

}
