package com.solution.leetcode;

public class LeetCode2000 {

    public String reversePrefix(String word, char ch) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == ch) {
                StringBuilder s = new StringBuilder();
                s.append(word, 0, i + 1).reverse();
                s.append(word.substring(i + 1));
                result = s.toString();
                break;
            }
        }
        if (result == "") {
            return word;
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode2000 leetCode2000 = new LeetCode2000();
        String result = leetCode2000.reversePrefix("abcdefd", 'd');
        result = leetCode2000.reversePrefix("abcd", 'z');
        System.out.println(result);
    }

}
