package com.solution.leetcode;

public class LeetCode2185 {

    public static void main(String[] args) {
        LeetCode2185 leetCode2185 = new LeetCode2185();
        int res = leetCode2185.prefixCount(new String[]{"pay", "attention", "practice", "attend"}, "at");
        System.out.println(res);
        res = leetCode2185.prefixCount(new String[]{"leetcode", "win", "loops", "success"}, "code");
        System.out.println(res);
    }

    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (isMatch(word, pref)) {
                count++;
            }
        }
        return count;
    }

    public boolean isMatch(String word, String pref) {
        if (word.length() < pref.length()) {
            return false;
        }
        String substring = word.substring(0, pref.length());
        return substring.equalsIgnoreCase(pref);
    }

}
