package com.solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode17 {


    static String digitletter[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            result = combine(digitletter[digits.charAt(i) - '0'], result);
        }
        return result;
    }

    public List<String> combine(String digit, List<String> l) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < digit.length(); i++) {
            for (String x : l) {
                result.add(x + digit.charAt(i));
            }
        }
        return result;
    }


    public static void main(String[] args) {
        LeetCode17 leetCode17 = new LeetCode17();
        List<String> stringList = leetCode17.letterCombinations("234");
//        ["ad","ae","af","bd","be","bf","cd","ce","cf"]
        System.out.println(stringList);
    }

}
