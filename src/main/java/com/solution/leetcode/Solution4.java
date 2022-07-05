package com.solution.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution4 {

    public List<Integer> random6(int number) {
        final List<Integer> tempList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            tempList.add(i);
        }
        Collections.shuffle(tempList);
        final List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            resultList.add(tempList.get(i));
        }
        return resultList;
    }


    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        List<Integer> integers = solution.random6(10);
        System.out.println(integers);
    }

}
