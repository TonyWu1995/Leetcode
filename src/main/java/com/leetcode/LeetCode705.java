package com.leetcode;

public class LeetCode705 {
    public static void main(String[] args) {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet.contains(1));
        System.out.println(hashSet.contains(3));

        hashSet.add(2);
        System.out.println(hashSet.contains(2));

        hashSet.remove(2);
        System.out.println(hashSet.contains(2));
    }

}

class MyHashSet {

    int[] hashset;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        this.hashset = new int[1000001];
    }

    public void add(int key) {
        hashset[key] = 1;
    }

    public void remove(int key) {
        hashset[key] = 0;
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return hashset[key] == 1;
    }
}
