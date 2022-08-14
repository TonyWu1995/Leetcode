package com.solution.leetcode;

public class LeetCode2255 {

    public static void main(String[] args) {
        LeetCode2255 leetCode2255 = new LeetCode2255();
        int result = leetCode2255.countPrefixes(new String[]{"a", "b", "c", "ab", "bc", "abc"}, "abc");
        System.out.println(result);
    }

    public int countPrefixes(String[] words, String s) {
        int count=0;
        for (String str : words) {
            if(s.startsWith(str)){
                count++;
            }
        }
        return count;
    }

}
