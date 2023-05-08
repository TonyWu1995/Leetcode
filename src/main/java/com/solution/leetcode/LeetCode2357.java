package com.solution.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode2357 {

    public static void main(String[] args) {
        LeetCode2357 leetCode2357 = new LeetCode2357();
        int res = leetCode2357.minimumOperations(new int[]{1, 5, 0, 3, 5});
        System.out.println(res);
    }

    public int minimumOperations(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int i : nums) {
            if (i != 0) {
                s.add(i);
            }
        }
        return s.size();
    }

}
