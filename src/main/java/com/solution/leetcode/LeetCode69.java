package com.solution.leetcode;

import java.util.ArrayList;

public class LeetCode69 {

    public int mySqrt(int x) {

        if (x <= 1) return x;
        int left = 1;
        int right = x / 2;
        while (left < right) {
            int mid = (left + (right - left) / 2) + 1;
            int div = x / mid;
            if (div == mid) {
                return mid;
            }
            if (div > mid) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        LeetCode69 leetCode69 = new LeetCode69();
        int res = leetCode69.mySqrt(8);
        System.out.println(res);
    }


}
