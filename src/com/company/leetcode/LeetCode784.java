package com.company.leetcode;

import java.util.*;

public class LeetCode784 {

    public static void main(String[] args) {
        String str = "a1b2";
        LeetCode784 leetCode784 = new LeetCode784();
        leetCode784.letterCasePermutation(str);
    }

    public List<String> letterCasePermutation(String S) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer(S);
        for (int i = 0; i < S.length(); i++) {
            if (!Character.isDigit(S.charAt(i))) {
                int size = queue.size();
                for (int j = 0; j < size; j++) {
                    String cur = queue.poll();
                    char[] arr = cur.toCharArray();
                    arr[i] = Character.toUpperCase(arr[i]);
                    queue.offer(String.valueOf(arr));
                    arr[i] = Character.toLowerCase(arr[i]);
                    queue.offer(String.valueOf(arr));
                }
            }

        }
        return new LinkedList<>(queue);
    }

}
