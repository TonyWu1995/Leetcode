package com.company.leetcode;

import java.util.Arrays;

public class LeetCode1103 {

    public static void main(String[] args) {
        LeetCode1103 leetCode1103 = new LeetCode1103();
        int candies = 20;
        int num_people = 3;
        leetCode1103.distributeCandies(candies, num_people);

    }

    public int[] distributeCandies(int candies, int num_people) {
        int result[] = new int[num_people];
        int mod = 0;
        for (int i = 1; i < candies; i++) {
            mod = i % num_people - 1;
            if (mod == -1) {
                mod = num_people - 1;
            }
            candies = candies - i;
            result[mod] += i;
        }

        result[++mod % num_people] += candies;
        return result;
    }
}
