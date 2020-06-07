package com.leetcode;

public class LeetCode1009 {

    public static void main(String[] args) {
        LeetCode1009 leetCode1009 = new LeetCode1009();
        final int result = leetCode1009.bitwiseComplement(5);
        System.out.println(result);
    }

    // N=10, ans = 5 = 16 - 10 - 1
    // N=7, ans = 0 = 8 - 7 -1
    // N=5, ans = 2 = 6 -5 -1
    // N = 10, binaryN 1010
    // ans = 5,binaryA 0101
    // binaryN + binaryA = 1111
    // binaryN + binaryA + 1= 10000
    // so, binaryA = 10000 - binaryN - 1
    public int bitwiseComplement(int N) {
        if (N <= 1) return 1 - N;
        int pui = 1;
        while (pui <= N) {
            pui *= 2;
        }
        return pui - 1 - N;
    }
}
