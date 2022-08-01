package com.solution.leetcode;

public class LeetCode35 {

    public static void main(String[] args) {
        LeetCode35 leetCode35 = new LeetCode35();
        int res = leetCode35.searchInsert(new int[]{1, 3, 5, 6}, 5);//2
        System.out.println(res);
        res = leetCode35.searchInsert(new int[]{1, 3, 5, 6}, 2);//1
        System.out.println(res);
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int index = left + (right - left) / 2;
            if (nums[index] == target) {
                return index;
            }
            if (target <= nums[index]) {
                right = index - 1;
            }else {
                left = index + 1;
            }
        }
        return left;
    }

}
