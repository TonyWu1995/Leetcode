package com.solution.leetcode;

public class LeetCode1880 {

    public static void main(String[] args) {
        LeetCode1880 leetCode1880 = new LeetCode1880();
        boolean result = leetCode1880.isSumEqual("acb", "cba", "cdb");
        System.out.println(result);

    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return calc(firstWord) + calc(secondWord) == calc(targetWord);
    }

    public int calc(String word) {
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            result += (word.charAt(i) - 'a') * Math.pow(10, word.length() - 1 - i);
        }
        return result;
    }

}
