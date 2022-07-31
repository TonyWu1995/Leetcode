package com.solution.leetcode;

import java.util.*;

public class LeetCode89 {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (isMatch(word, pattern)) {
                res.add(word);
            }
        }
        return res;
    }

    public boolean isMatch(String word, String pattern) {
        Map<Character, Character> patternCountMap = new HashMap<>();
        Map<Character, Character> wordCountMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if (!patternCountMap.containsKey(p)) {
                patternCountMap.put(p, w);
            }
            if (!wordCountMap.containsKey(w)) {
                wordCountMap.put(w, p);
            }
            if (patternCountMap.get(p) != w || wordCountMap.get(w) != p) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        LeetCode89 leetCode89 = new LeetCode89();

        List<String> res = leetCode89.findAndReplacePattern(new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb");
        System.out.println(res);
    }

}
