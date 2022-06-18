package com.solution.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode217 {

    public static void main(String[] args) {
        LeetCode217 leetCode217 = new LeetCode217();
        boolean result = leetCode217.containsDuplicate(new int[]{1, 2, 3, 1});
        System.out.println(result);
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums)
            if(!set.add(i))
                return true;
        return false;
    }

}
