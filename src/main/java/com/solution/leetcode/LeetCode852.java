package com.solution.leetcode;

public class LeetCode852 {

//    Let's call an array A a mountain if the following properties hold:
//
//    A.length >= 3
//    There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
//    Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
//
//    Example 1:
//
//    Input: [0,1,0]
//    Output: 1
//    Example 2:
//
//    Input: [0,2,1,0]
//    Output: 1

    public static void main(String[] args) {
        LeetCode852 leetCode852 = new LeetCode852();
        int A[] = new int[]{0, 2, 1, 0};
        int result = leetCode852.peakIndexInMountainArray(A);
        System.out.println(result);
    }


    //O(n)
    public int peakIndexInMountainArray2(int[] A) {
        int result = 0;
        while (A[result] < A[result + 1]) {
            result++;
        }
        return result;
    }

    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

}
