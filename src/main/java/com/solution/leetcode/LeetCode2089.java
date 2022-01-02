package com.solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode2089 {

    public static void main(String[] args) {
//         nums = [1,2,5,2,3], target = 2 [1,2]
//        1,2,2,3,5
        LeetCode2089 leetCode2089 = new LeetCode2089();
        System.out.println(leetCode2089.targetIndices(new int[]{1, 2, 5, 2, 3}, 2));
    }


    public List<Integer> targetIndices(int[] nums, int target) {
        int equalCount = 0;
        int lessCount = 0;
        for (int number : nums) {
            if (number == target) {
                equalCount++;
            }
            if (number < target) {
                lessCount++;
            }
        }
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < equalCount; i++) {
            resultList.add(lessCount++);
        }
        return resultList;
    }

}
