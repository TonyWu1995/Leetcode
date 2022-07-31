package com.solution.leetcode;

public class LeetCode1732 {

    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : gain) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        if (max < 0) {
            max = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        LeetCode1732 leetCode1732 = new LeetCode1732();
//1
        int res = leetCode1732.largestAltitude(new int[]{-5, 1, 5, 0, -7});
        System.out.println(res);
        res = leetCode1732.largestAltitude(new int[]{
                -4, -3, -2, -1, 4, 3, 2});
        System.out.println(res);
    }

}
