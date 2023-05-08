package com.solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1630 {

    public static void main(String[] args) {
        LeetCode1630 leetCode1630 = new LeetCode1630();
        List<Boolean> result = leetCode1630.checkArithmeticSubarrays(new int[]{
                4, 6, 5, 9, 3, 7
        }, new int[]{0, 0, 2}, new int[]{2, 3, 5});
        System.out.println(result);
    }

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int[] newArray = new int[r[i] - l[i] + 1];
            for (int j = 0; j < newArray.length; j++) {
                newArray[j] = nums[j + l[i]];
            }
            Arrays.sort(newArray);
            result.add(isArithmetic(newArray));
        }
        return result;
    }

    public boolean isArithmetic(int[] nums) {
        if (nums.length < 2) {
            return true;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] - nums[i - 1] != nums[i + 1] - nums[i]) {
                return false;
            }
        }
        return true;
    }


}
