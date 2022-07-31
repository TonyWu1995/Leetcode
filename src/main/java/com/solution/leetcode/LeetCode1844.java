package com.solution.leetcode;

public class LeetCode1844 {

    public String replaceDigits(String s) {
        char[] charArray = s.toCharArray();
        for(int i = 1; i<charArray.length; i = i + 2) {
            charArray[i] = (char) (charArray[i - 1] + charArray[i] - '0');
        }
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        LeetCode1844 leetCode1844 = new LeetCode1844();
        System.out.println(leetCode1844.replaceDigits("a1c1e1"));
    }

}
