package com.solution.protto;

import java.util.HashMap;
import java.util.Map;

public class Task4 {

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        System.out.println(task4.solution(new int[]{2, 1, 3}, 2));
//        System.out.println(task4.solution(new int[]{0, 4, 3, -1}, 2));
//        System.out.println(task4.solution(new int[]{2, 1, 4}, 3));

    }

    public int solution(int[] A, int S) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            int key = sum - (S * (i + 1));
            res += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return Math.min(res, 1000000000);
    }


}
