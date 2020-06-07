package com.leetcode;


import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode771 {

//    You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
//
//    The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//    Example 1:
//
//    Input: J = "aA", S = "aAAbbbb"
//    Output: 3
//    Example 2:
//
//    Input: J = "z", S = "ZZ"
//    Output: 0

    public static void main(String[] args) {
        LeetCode771 leetCode771 = new LeetCode771();

        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(leetCode771.numJewelsInStones(J, S));
    }

    public int numJewelsInStones(String J, String S) {
        int result = 0;
        Set<Character> jSet = new HashSet<>();
        for (char c :
                J.toCharArray()) {
            jSet.add(c);
        }
        for (char c : S.toCharArray()) {
            if (jSet.contains(c)) {
                result++;
            }
        }
        return result;
    }

}
