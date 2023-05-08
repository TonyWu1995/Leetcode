package com.solution.leetcode;

import java.util.*;

public class LeetCode1356 {

    public static void main(String[] args) {
        LeetCode1356 leetCode1356 = new LeetCode1356();
        int[] res = leetCode1356.sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8});
//        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(leetCode1356.sortByBits(new int[]{
                1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1})));
    }

    class ComparatorImpl implements Comparator<int[]> {

        @Override
        public int compare(int[] a, int[] b) {
            if (a[1] != b[1]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        }
    }


    public int[] sortByBits(int[] arr) {
        int[][] count = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            count[i][0] = arr[i];
            count[i][1] = Integer.bitCount(arr[i]);
        }
        Arrays.sort(count, new ComparatorImpl());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count[i][0];
        }
        return arr;
    }

    public int[] sortByBits2(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int j : arr) {
            int k = Integer.bitCount(j);
            List<Integer> l = map.getOrDefault(k, new ArrayList<>());
            l.add(j);
            map.put(k, l);
        }
        Set<Integer> keys = new TreeSet<>(map.keySet());
        List<Integer> result = new ArrayList<>();
        for (int i : keys) {
            Collections.sort(map.get(i));
            result.addAll(map.get(i));
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

}
