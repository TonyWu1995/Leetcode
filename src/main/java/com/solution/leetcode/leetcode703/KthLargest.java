package com.solution.leetcode.leetcode703;

import java.util.PriorityQueue;
import java.util.Queue;

class KthLargest {

    Queue<Integer> q;

    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.q = new PriorityQueue<>(k);
        for (int i : nums) {
            q.offer(i);
            if (q.size() > k) {
                q.poll();
            }
        }
    }

    public int add(int val) {
        this.q.offer(val);
        if (this.q.size() > k) {
            this.q.poll();
        }
        return this.q.peek();
    }

}
