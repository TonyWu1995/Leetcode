package com.solution.leetcode;

import java.util.Arrays;

public class LeetCode557 {

    public static void main(String[] args) {
        LeetCode557 leetCode557 = new LeetCode557();
        String s = "Let's take LeetCode contest";
        String result = leetCode557.reverseWords(s);
        System.out.println(result);
    }

    public String reverseWords(String s) {
        String splits[] = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : splits) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return result.toString().trim();
    }
}
