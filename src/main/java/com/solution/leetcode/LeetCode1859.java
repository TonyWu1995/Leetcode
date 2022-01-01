package com.solution.leetcode;

public class LeetCode1859 {

    public static void main(String[] args) {
        LeetCode1859 leetCode1859 = new LeetCode1859();
        System.out.println(leetCode1859.sortSentence("is2 sentence4 This1 a3"));
    }

    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] res = new String[str.length];
        for (String elem : str) {
            int index = (int) (elem.charAt(elem.length() - 1) - '0');
            res[index - 1] = elem.substring(0, elem.length() - 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < res.length - 1; i++) {
            stringBuilder.append(res[i])
                    .append(" ");
        }
        stringBuilder.append(res[res.length - 1]);
        return stringBuilder.toString();
    }

}
