package com.solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {

    public int solution(int N, String S) {
        // write your code in Java SE 11
        if (S.equalsIgnoreCase("")) {
            return N * 2;
        }
        String[] s = S.split(" ");
        List<List<String>> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(new ArrayList<>());
        }
        for (String str : s) {
            String[] split = str.split("");
            int n = Integer.parseInt(split[0]);
            list.get(n - 1).add(split[1]);
        }
        int res = 0;
        for (List<String> l : list) {
            if (l.contains("B") || l.contains("C") || l.contains("H") || l.contains("J")) {
                res += 1;
                continue;
            }
            if (!(l.contains("B") || l.contains("C") || l.contains("D") || l.contains("E"))) {
                res += 1;
                continue;
            }
            if (!(l.contains("F") || l.contains("G") || l.contains("H") || l.contains("J"))) {
                res += 1;
                continue;
            }
            res += 2;
        }
        return res;
    }

    public static void main(String[] args) {

        Solution3 solution = new Solution3();
        int N = 2;
        String S = "1A 2F 1C";
        System.out.println(solution.solution(N, S));

//        N = 1;
//        S = "";
//        System.out.println(solution.solution(N, S));

    }

}
