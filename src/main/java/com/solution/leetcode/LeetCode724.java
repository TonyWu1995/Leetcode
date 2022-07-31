package com.solution.leetcode;

public class LeetCode724 {

    public static void main(String[] args) {
        LeetCode724 leetCode724 = new LeetCode724();
        int res = leetCode724.pivotIndex(new int[]{1, 7, 3, 6, 5, 6});
        System.out.println(res);
    }

    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for (int x : nums) {
            sum += x;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

}
