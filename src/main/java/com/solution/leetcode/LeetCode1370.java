package com.solution.leetcode;

import java.util.Arrays;

public class LeetCode1370 {

    public static void main(String[] args) {
        LeetCode1370 code1370 = new LeetCode1370();

        System.out.println(code1370.sortString("aaaabbbbcccc"));
    }

    public String sortString(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (count < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    sb.append((char) (i + 'a'));
                    freq[i] = freq[i] - 1;
                    count++;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    sb.append((char) (i + 'a'));
                    freq[i] = freq[i] - 1;
                    count++;
                }
            }
        }
        return sb.toString();
    }

}
