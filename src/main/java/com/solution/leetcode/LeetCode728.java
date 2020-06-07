package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode728 {
//    A self-dividing number is a number that is divisible by every digit it contains.
//
//    For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
//
//    Also, a self-dividing number is not allowed to contain the digit zero.
//
//    Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
//
//            Example 1:
//    Input:
//    left = 1, right = 22
//    Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]

    public static void main(String[] args) {
        LeetCode728 leetCode728 = new LeetCode728();
        List<Integer> result = leetCode728.selfDividingNumbers(1, 22);
        System.out.println(result);
    }


    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDebvidingNumber(i))
                resultList.add(i);
        }
        return resultList;
    }

    public boolean isSelfDebvidingNumber(int number) {
        for (char c : String.valueOf(number).toCharArray()) {
            if (c == '0' || (number % (c - '0') > 0))
                return false;
        }
        return true;
    }
}
