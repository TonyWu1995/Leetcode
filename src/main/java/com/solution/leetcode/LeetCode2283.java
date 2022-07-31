package com.solution.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode2283 {

    public boolean digitCount(String num) {
        Map<String, Integer> countMap = new HashMap();
        String[] strings = num.split("");
        for (String s : strings) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }
        for (int i = 0; i < num.length(); i++) {
            if (countMap.getOrDefault(i + "", 0) != Integer.parseInt(strings[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode2283 leetCode2283 = new LeetCode2283();

        boolean count = leetCode2283.digitCount("1210");
        System.out.println(count);
    }
}
