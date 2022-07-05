package com.solution.leetcode;

public class Solution1 {


    public int solution(int[] A) {
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

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
//        int arr[] = {4, 2, 5, 8, 7, 3, 7};
//        System.out.println(solution.solution(arr));
//        int arr1[] = {5, 5, 5, 5, 5, 5};
//        System.out.println(solution.solution(arr1));
        int arr2[] = {14, 21, 16, 35, 22};
        System.out.println(solution.solution(arr2));

    }

}
