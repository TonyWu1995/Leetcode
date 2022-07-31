package com.solution.leetcode;

public class LeetCode1910 {

    public static void main(String[] args) {
        LeetCode1910 leetCode1910 = new LeetCode1910();
        String res = leetCode1910.removeOccurrences(
                "aabababa", "aba");
        System.out.println(res);
    }

    public String removeOccurrences(String s, String part) {
        int index = s.indexOf(part);
        while (index != -1) {
            s = s.substring(0, index) + s.substring(index + part.length());
            index = s.indexOf(part);
        }
        return s;
    }

    public String replace(String s, String part) {
        if (s.contains(part)) {
            return replace(s.replaceFirst(part, ""), part);
        }
        return s;
    }

}
