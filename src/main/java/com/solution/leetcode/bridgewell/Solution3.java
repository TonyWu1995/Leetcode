package com.solution.leetcode.bridgewell;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution3 {

    public static long kSub(int k, List<Integer> nums) {
        long ans = 0;
        long sum = 0;
        long rem = 0;
        Map<Long, Long> map = new HashMap<>();
        map.put(0L, 1L);
        for (int num : nums) {
            sum += num;
            rem = sum % k;
            if (rem < 0) {
                rem += k;
            }
            if (map.containsKey(rem)) {
                ans += map.get(rem);
                map.put(rem, map.get(rem) + 1);
            } else {
                map.put(rem, 1L);
            }
            System.out.println(map);
        }
        return ans;
    }

    public static void main(String[] args) {
        long res = kSub(3, List.of(1, 2, 3, 4, 1));
        System.out.println(res);
    }

}
