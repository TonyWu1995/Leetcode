package com.solution.leetcode;

import java.util.HashMap;
import java.util.Map;

//Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
//
//Given a balanced string s, split it in the maximum amount of balanced strings.
//
//Return the maximum amount of split balanced strings.
//
//
//
//Example 1:
//
//Input: s = "RLRRLLRLRL"
//Output: 4
//Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
//Example 2:
//
//Input: s = "RLLLLRRRLR"
//Output: 3
//Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
public class LeetCode1221 {

    public static void main(String[] args) {
        LeetCode1221 leetCode1221 = new LeetCode1221();
        int result = leetCode1221.balancedStringSplit("RLRRLLRLRL"); //4
        System.out.println(result);
    }

    public int balancedStringSplit(String s) {
        int result = 0;
        int sum = 0;
        for (char letter : s.toCharArray()) {
            sum += (letter == 'L' ? 1 : -1);
            if (sum == 0) {
                result++;
            }
        }
        return result;
    }

}
