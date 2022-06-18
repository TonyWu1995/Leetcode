package com.solution.leetcode;

import java.util.Arrays;

public class LeetCode88 {

    public static void main(String[] args) {
        LeetCode88 leetCode88 = new LeetCode88();
//        nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        Output: [1,2,2,3,5,6]
        leetCode88.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1;
        int tail2 = n - 1;
        int finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ?
                    nums1[tail1--] : nums2[tail2--];
        }
        while (tail2 >= 0) {
            nums1[finished--] = nums2[tail2--];
        }
        System.out.println(Arrays.toString(nums1));
    }

}
