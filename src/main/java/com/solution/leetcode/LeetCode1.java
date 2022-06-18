package com.solution.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {

    public static void main(String[] args) {
        LeetCode1 leetCode1 = new LeetCode1();
        int[] sum = leetCode1.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(sum));
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

}
