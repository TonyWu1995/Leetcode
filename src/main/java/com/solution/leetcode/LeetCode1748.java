package com.solution.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LeetCode1748 {

    public static void main(String[] args) {
//        nums = [1,2,3,2]
        LeetCode1748 leetCode1748 = new LeetCode1748();
        int sum = leetCode1748.sumOfUnique(new int[]{1, 2, 3, 2});
        System.out.println(sum);
    }

    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int number : nums) {
            if (integerMap.containsKey(number)) {
                integerMap.put(number, integerMap.get(number) + 1);
            } else {
                integerMap.put(number, 1);
            }
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        return sum;
    }


}
