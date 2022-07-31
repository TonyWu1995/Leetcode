package com.solution.leetcode;

public class LeetCode1863 {

    public static void main(String[] args) {
        LeetCode1863 leetCode1863 = new LeetCode1863();
        //6
        int res = leetCode1863.subsetXORSum(new int[]{5, 1, 6});
        System.out.println(res);
    }

    public int subsetXORSum(int[] nums) {
        return subsetXORSum(nums, 0, 0);
    }

    public int subsetXORSum(int nums[], int index, int xor) {
        if (index == nums.length) {
            return xor;
        }
        int sum = 0;
        for (int i = index; i < nums.length; i++) {
            sum += subsetXORSum(nums, i + 1, nums[i] ^ xor);
        }
        return xor + sum;
    }


}
