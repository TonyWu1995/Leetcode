package com.solution.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode349 {

    public static void main(String[] args) {
        LeetCode349 leetCode349 = new LeetCode349();
        int[] ints = leetCode349.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        System.out.println(Arrays.toString(ints));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for (int i : nums1) s1.add(i);
        Set<Integer> s2 = new HashSet<>();
        for (int i : nums2) s2.add(i);
        s1.retainAll(s2);
        return s1.stream().mapToInt(Integer::intValue)
                .toArray();
    }

}
