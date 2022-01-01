package com.solution.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode2006 {

    public static void main(String[] args) {
        LeetCode2006 leetCode2006 = new LeetCode2006();

        leetCode2006.countKDifference(new int[]{
                3,2,1,5,4
        }, 2);

    }


    public int countKDifference(int[] nums, int k) {
        final Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] - k)) {
                res += map.get(nums[i] - k);
            }
            if (map.containsKey(nums[i] + k)) {
                res += map.get(nums[i] + k);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return res;
    }
}
