package com.solution.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode146 {

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
//        System.out.println(lRUCache.get(1));
        lRUCache.get(1);    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
//        lRUCache.get(2);    // returns -1 (not found)
        System.out.println(lRUCache.get(2));
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
//        lRUCache.get(1);    // return -1 (not found)
//        lRUCache.get(3);    // return 3
//        lRUCache.get(4);    // return 4
    }


    static class LRUCache {

        private static class DNode {
            int key;
            int val;
            DNode prev;
            DNode next;
        }

        private Map<Integer, DNode> hashtable;
        private DNode head;
        private DNode tail;
        private int totalItemsInCache;
        private int capacity;

        public LRUCache(int capacity) {
            totalItemsInCache = 0;
            this.capacity = capacity;
            this.hashtable = new HashMap<Integer, DNode>();
            head = new DNode();
            head.prev = null;
            tail = new DNode();
            tail.next = null;
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            DNode node = hashtable.get(key);
            if (node == null) {
                return -1;
            }
            moveToHead(node); //the most recent node move to the head

            return node.val;
        }

        public void put(int key, int value) {
            DNode node = hashtable.get(key);
            if (node == null) {
                DNode newNode = new DNode();
                newNode.key = key;
                newNode.val = value;

                hashtable.put(key, newNode);
                addNode(newNode); //add newNode to the doubly linked list

                totalItemsInCache++;

                if (totalItemsInCache > capacity)
                    removeLRUItem(); //remove LRU item from hashtable & linked list
            } else {
                node.val = value;
                moveToHead(node);
            }
        }

        private void removeLRUItem() {
            DNode tail = popTail();
            hashtable.remove(tail.key);
            totalItemsInCache--;
        }

        private void moveToHead(DNode node) {
            removeNode(node);
            addNode(node);
        }

        private void addNode(DNode node) {
            node.prev = head;
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
        }

        private void removeNode(DNode node) {
            DNode savePrev = node.prev;
            DNode saveNext = node.next;

            savePrev.next = saveNext;
            saveNext.prev = savePrev;
        }

        private DNode popTail() {
            DNode itemBeingRemoved = tail.prev;
            removeNode(itemBeingRemoved);
            return itemBeingRemoved;
        }
    }


}
