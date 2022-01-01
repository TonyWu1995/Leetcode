package com.solution.leetcode;

public class LeetCode1816 {

    public static void main(String[] args) {
        LeetCode1816 leetCode1816 = new LeetCode1816();
        System.out.println(
                leetCode1816.truncateSentence("Hello how are you Contestant", 4)
        );
    }

    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < k - 1; i++) {
            stringBuilder
                    .append(str[i])
                    .append(" ");
        }
        stringBuilder.append(str[k - 1]);
        return stringBuilder.toString();
    }

}
