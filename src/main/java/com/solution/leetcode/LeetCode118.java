package com.solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {

    public static void main(String[] args) {
        LeetCode118 leetCode118 = new LeetCode118();
        List<List<Integer>> lists = leetCode118.generate(5);
        System.out.println(lists);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    int a = result.get(i - 1).get(j - 1);
                    int b = result.get(i - 1).get(j);
                    list.add(a + b);
                }
            }
            result.add(list);
        }
        return result;
    }
}
