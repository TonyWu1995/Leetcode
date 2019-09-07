package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1160 {
    //    You are given an array of strings words and a string chars.
//
//    A string is good if it can be formed by characters from chars (each character can only be used once).
//
//    Return the sum of lengths of all good strings in words.
//
//
//
//            Example 1:
//
//    Input: words = ["cat","bt","hat","tree"], chars = "atach"
//    Output: 6
//    Explanation:
//    The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
//    Example 2:
//
//    Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
//    Output: 10
//    Explanation:
//    The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
    public static void main(String[] args) {
        LeetCode1160 leetCode1160 = new LeetCode1160();
        String words[] = new String[]{"cat", "bt", "hat", "tree"};
        String chars = "atach";
        leetCode1160.countCharacters(words, chars);
    }

    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> characterMap = new HashMap<>();
        for (char c : chars.toCharArray()) {
            characterMap.put(c, characterMap.getOrDefault(c, 0) + 1);
        }
        int result = 0;

        Map<Character, Integer> cloneMap;
        for (String word : words) {
            cloneMap = (Map<Character, Integer>) ((HashMap<Character, Integer>) characterMap).clone();
            boolean res = true;
            for (char c : word.toCharArray()) {

                if (cloneMap.get(c) == null || cloneMap.get(c) <= 0) {
                    res = false;
                    break;
                } else {
                    cloneMap.put(c, cloneMap.get(c) - 1);
                }
            }
            if (res) {
                result += word.length();
            }
        }
        System.out.println(result);
        return result;
    }

}
