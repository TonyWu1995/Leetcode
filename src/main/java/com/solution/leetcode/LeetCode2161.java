package com.solution.leetcode;

import java.util.Arrays;

public class LeetCode2161 {

    public static void main(String[] args) {
        LeetCode2161 leetCode2161 = new LeetCode2161();
        int[] array = leetCode2161.pivotArray(new int[]{9, 12, 5, 10, 14, 3, 10}, 10);
        System.out.println(Arrays.toString(array));
    }

    public int[] pivotArray(int[] nums, int pivot) {
        int small = 0;
        int equal = 0;
        for (int i : nums) {
            if (pivot > i) small++;
            if (pivot == i) equal++;
        }
        int[] result = new int[nums.length];
        int left = 0;
        int e = small;
        int right = small + equal;

        for (int num : nums) {
            if (pivot == num) {
                result[e++] = num;
            }
            if (pivot > num) {
                result[left++] = num;
            }
            if (pivot < num) {
                result[right++] = num;
            }
        }

        return result;
    }

}
