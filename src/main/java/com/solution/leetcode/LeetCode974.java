package com.solution.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode974 {

    public int subarraysDivByK(int[] nums, int k) {
        int res = 0;
        int sum = 0;
        int rem = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            rem = sum % k;
            if (rem < 0) {
                rem += k;
            }
            if (map.containsKey(rem)) {
                System.out.println("map1" + map);
                res += map.get(rem);
                System.out.println("res=" + res);
                map.put(rem, map.get(rem) + 1);
            } else {
                map.put(rem, 1);
            }
            System.out.println("map2" + map);
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode974 leetCode974 = new LeetCode974();

        int[] nums = new int[]{
                4, 5, 0, -2, -3, 1
        };
        int k = 5;

        int res = leetCode974.subarraysDivByK(nums, k);

        //7
        System.out.println(res);
    }

}
