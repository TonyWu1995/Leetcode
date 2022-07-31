package com.solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {


    public int solution1(int[] A) {
        // write your code in Java SE 11
        int res = 0;
        int size = A.length - 1;
        for (int i = 0; i < size; i += 2) {
            if ((A[i] + A[i + 1]) % 2 == 0) {
                res++;
            }
        }
        if (res > 0) {
            return res;
        }

        for (int i = size; i >= 1; i = i - 2) {
            if ((A[i] + A[i - 1]) % 2 == 0) {
                res++;
            }
        }
        if ((A[size] + A[0]) % 2 == 0) {
            res++;
        }
        return res;
    }

    public int solution(int[] A) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (i == 0) {
                list.add(A[i] + A[A.length - 1]);
            } else {
                list.add(A[i - 1] + A[i]);
            }
        }
        int result1 = 0;
        int result2 = 0;
        System.out.println(list);
        for (int i = 0; i < list.size(); i += 2) {
            if (list.get(i) % 2 == 0) {
                result1++;
            }
            if (i + 1 < list.size() && list.get(i + 1) % 2 == 0) {
                result2++;
            }
        }
        System.out.println(result1);
        System.out.println(result2);
        return Math.max(result2, result1);
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int arr[] = {4, 2, 5, 8, 7, 3, 7};
        System.out.println(solution.solution(arr));
//        int arr1[] = {5, 5, 5, 5, 5, 5};
//        System.out.println(solution.solution(arr1));
//        int arr2[] = {14, 21, 16, 35, 22};
//        System.out.println(solution.solution(arr2));

    }

}
