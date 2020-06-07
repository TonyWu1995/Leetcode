package com.solution.leetcode;

import java.util.Arrays;

public class LeetCode1122 {

    //    Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
//
//Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.
//
//
    public static void main(String[] args) {
        LeetCode1122 leetCode1122 = new LeetCode1122();
        int arr1[] = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int arr2[] = new int[]{2, 1, 4, 3, 9, 6};
        int results[] = leetCode1122.relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(results));
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[1001];
        for (int n : arr1) {
            arr[n]++;
        }
        int i = 0;
        for (int n : arr2) {
            while (arr[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        for (int n = 0; n < arr.length; n++) {
            while (arr[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        return arr1;
    }

}
