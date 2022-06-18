package com.solution.leetcode;

import java.util.*;

public class LeetCode1817 {


    public static void main(String[] args) {
//Input: logs = [[0,5],[1,2],[0,2],[0,5],[1,3]], k = 5
//Output: [0,2,0,0,0]
        LeetCode1817 leetCode1817 = new LeetCode1817();
        int[] minutes = leetCode1817.findingUsersActiveMinutes(new int[][]{
                {0, 5},
                {1, 2},
                {0, 2},
                {0, 5},
                {1, 3}
        }, 5);
        System.out.println(Arrays.toString(minutes));
    }


    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] result = new int[k];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] l : logs) {
            map.putIfAbsent(l[0], new HashSet<>());
            map.get(l[0]).add(l[1]);
        }
        for (int key : map.keySet()) {
            result[map.get(key).size() - 1]++;
        }
        return result;
    }

}
