package com.solution.leetcode;

public class LeetCode1374 {

    public String generateTheString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                stringBuilder.append("a");
            }
            return stringBuilder.toString();
        }
        for (int i = 0; i < n - 1; i++) {
            stringBuilder.append("a");
        }
        stringBuilder.append("b");
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        LeetCode1374 leetCode1374 = new LeetCode1374();
        String s = leetCode1374.generateTheString(4);
        System.out.println(s);
    }
}
