package com.company.leetcode;

import java.util.*;

public class LeetCode500 {

    public static void main(String[] args) {
        LeetCode500 leetCode500 = new LeetCode500();
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};

        System.out.println(Arrays.toString(leetCode500.findWords(words)));
    }

    public String[] findWords(String[] words) {
        String[] strArray = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strArray.length; i++) {
            for (char c : strArray[i].toCharArray()) {
                map.put(c, i);
            }
        }
        int index;
        List<String> resultList = new ArrayList<>();
        for (String word : words) {
            index = map.get(word.toLowerCase().toCharArray()[0]);
            for (char c : word.toLowerCase().toCharArray()) {
                if (map.get(c) != index) {
                    index = -1;
                    break;
                }
            }
            if (index != -1) {
                resultList.add(word);
            }
        }
        return resultList.toArray(new String[0]);
    }
}
