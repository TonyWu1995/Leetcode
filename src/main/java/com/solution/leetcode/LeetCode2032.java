package com.solution.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode2032 {

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set = new HashSet();
        Set<Integer> result = new HashSet();
        for (int i : nums1) {//add all number on nums1 to set
            set.add(i);
        }
        for (int i : nums2) {// findout if there any intersection with nums2
            if (set.contains(i)) {
                result.add(i);
            }
        }
        for (int i : nums2) { //lately add all numbers from nums2 to set.
            set.add(i);
        }
        for (int i : nums3) { // check if there is intersection with again for nums3
            if (set.contains(i)) {
                result.add(i);
            }
        }
        return new ArrayList(result);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 1, 3, 2};
        int[] nums2 = new int[]{2, 3};
        int[] nums3 = new int[]{3};
        LeetCode2032 leetCode2032 = new LeetCode2032();
        List<Integer> list = leetCode2032.twoOutOfThree(nums1, nums2, nums3);
        System.out.println(list);
    }

}
