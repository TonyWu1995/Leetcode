package com.solution.tsrend;

import java.util.*;

public class Solution2 {

    public int solution(String S, int B) {
        // write your code in Java SE 8
        String[] splitResult = S.split("\\.");
        List<String> xList = new ArrayList<>();
        for (String s : splitResult) {
            if (s.contains("x")) {
                xList.add(s);
            }
        }
        int res = 0;
        if (xList.size() == 1) {
            res = B - 1;
            return res;
        }
        for (String x : xList) {
            for (String ignored : x.split("")) {
                if (0 == B) {
                    break;
                }
                res++;
                B--;
            }
            B--;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String S = "...xxx..x....xxx";
        int B = 7;
        //ans 5
        System.out.println(solution.solution(S, B));


        S = "..xxxx";
        B = 4;
        //ans 3
        System.out.println(solution.solution(S, B));
////
        S = "x.x.xxx...x";
        B = 14;
        //ans 6
        System.out.println(solution.solution(S, B));
//// 0
        S = "..";
        B = 5;
        System.out.println(solution.solution(S, B));

    }

}
