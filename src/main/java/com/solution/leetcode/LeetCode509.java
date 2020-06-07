package com.leetcode;

public class LeetCode509 {
    //    The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
    //
    //F(0) = 0,   F(1) = 1
    //F(N) = F(N - 1) + F(N - 2), for N > 1.
    //Given N, calculate F(N).

    public static void main(String[] args) {
        LeetCode509 leetCode509 = new LeetCode509();
        int N = 0;
        final int result = leetCode509.fib(N);
        System.out.println(result);
    }

    public int fib(int N) {
        if (N < 1) {
            return N;
        }
        int[] results = new int[N + 1];
        results[0] = 0;
        results[1] = 1;
        for (int i = 2; i <= N; i++) {
            results[i] = results[i - 1] + results[i - 2];
        }
        return results[N];
    }
}
