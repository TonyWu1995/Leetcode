package com.solution.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode2325 {

    String[] alpha = new String[]{
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
            "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z"
    };

    public String decodeMessage(String key, String message) {
        Map<String, String> m = new HashMap<>();
        int index = 0;
        for (String s : key.split("")) {
            if (!" ".equalsIgnoreCase(s) && !m.containsKey(s)) {
                m.put(s, alpha[index]);
                index++;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (String s : message.split("")) {
            builder.append(m.getOrDefault(s," "));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String input = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        LeetCode2325 leetCode2325 = new LeetCode2325();
        String res = leetCode2325.decodeMessage(input, message);
        System.out.println(res);
    }

}
