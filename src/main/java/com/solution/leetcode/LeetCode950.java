package com.solution.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode950 {

    public static void main(String[] args) {

        LeetCode950 leetCode950 = new LeetCode950();
        int[] res = leetCode950.deckRevealedIncreasing(new int[]{17, 13, 11, 2, 3, 5, 7});
        System.out.println(Arrays.toString(res));
    }

    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) q.add(i);
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[q.poll()] = deck[i];
            q.add(q.poll());
        }
        return res;
    }
}
