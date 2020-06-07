package com.leetcode;

import java.util.Arrays;

public class LeetCode1051 {

//    Students are asked to stand in non-decreasing order of heights for an annual photo.

//    Return the minimum number of students not standing in the right positions.  (This is the number of students that must move in order for all students to be standing in non-decreasing order of height.)

    public static void main(String[] args) {
        LeetCode1051 leetCode1051 = new LeetCode1051();
        int heights[] = new int[]{1,1,4,2,1,3};
        final int result = leetCode1051.heightChecker(heights);
        System.out.println(result);
    }

    public int heightChecker(int[] heights) {
        int result = 0;
        int[] copyHeights = Arrays.copyOf(heights, heights.length);
        Arrays.sort(copyHeights);
        for (int i = 0; i < heights.length; i++) {
            if (copyHeights[i] != heights[i]) {
                result++;
            }
        }
        return result;
    }

}
