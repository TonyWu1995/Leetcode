package com.solution.leetcode;

import java.util.Arrays;

public class LeetCode2399 {

    public static void main(String[] args) {
        LeetCode2399 leetCode2399 = new LeetCode2399();
        boolean res = leetCode2399.checkDistances("abaccb", new int[]{1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        System.out.println(res);
    }

    public boolean checkDistances(String s, int[] distance) {
        int[] v = new int[26];
        Arrays.fill(v, -1);
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            int idx = s.charAt(i) - 'a';
            if (v[idx] != -1 && i - v[idx] - 1 != distance[idx]) {
                return false;
            }
            v[idx] = i;
        }
        return true;
    }

}
