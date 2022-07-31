package com.solution.leetcode;

public class LeetCode704 {

    public static void main(String[] args) {
        LeetCode704 leetCode704 = new LeetCode704();
        int res = leetCode704.search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        System.out.println(res);
    }

    public int search(int[] nums, int target) {
        int res = 0;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            res = left + (right - left) / 2;
            if (nums[res] == target) {
                return res;
            }
            if (target <= nums[res]) {
                right = res - 1;
            }else {
                left = res + 1;
            }
        }
        return -1;
    }


}
