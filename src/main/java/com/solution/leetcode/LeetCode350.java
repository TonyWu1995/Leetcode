package com.solution.leetcode;

import java.util.*;

public class LeetCode350 {

    public static void main(String[] args) {
        LeetCode350 leetCode350 = new LeetCode350();
//        Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]
        int[] result = leetCode350.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        System.out.println(Arrays.toString(result));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums1) {
            int freq = map.getOrDefault(n, 0);
            map.put(n, freq + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int i : nums2) {
            if (map.get(i) != null && map.get(i) > 0) {
                result.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] ret = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ret[i] = result.get(i);
        }
        return ret;
    }

}
