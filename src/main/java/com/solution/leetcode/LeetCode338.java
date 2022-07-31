package com.solution.leetcode;

import java.util.Arrays;

public class LeetCode338 {

    public static void main(String[] args) {
        LeetCode338 leetCode338 = new LeetCode338();
        int[] bits = leetCode338.countBits(5);
        System.out.println(Arrays.toString(bits));
        System.out.println(3>>1);
    }

    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }

}
