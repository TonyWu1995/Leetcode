package com.solution.leetcode;

public class LeetCode367 {

    public static void main(String[] args) {

        LeetCode367 leetCode367 = new LeetCode367();
        boolean result = leetCode367.isPerfectSquare(808201);
        System.out.println(result);
    }

    public boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num;
        while (left <= right) {
            long mid = (left + right) / 2;
            long temp = mid * mid;
            if (temp == num) {
                return true;
            }
            if (temp < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

}
