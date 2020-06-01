package com.leetcode;

public class LeetCode922 {

    public static void main(String[] args) {
        LeetCode922 leetCode922 = new LeetCode922();
        leetCode922.sortArrayByParityII(new int[]{4, 2, 5, 7});
    }

    public int[] sortArrayByParityII(int[] A) {
        int result[] = new int[A.length];
        int i = 0;
        for (int j : A) {
            if (j % 2 == 0) {
                result[i] = j;
                i += 2;
            }
        }
        i = 1;
        for (int j : A) {
            if (j % 2 == 1) {
                result[i] = j;
                i += 2;
            }
        }
        return result;
    }
}
