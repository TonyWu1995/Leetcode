package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode559 {

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static void main(String[] args) {
        List<Node> thirdNode = new ArrayList<>();
        thirdNode.add(new Node(5, List.of()));
        thirdNode.add(new Node(6, List.of()));
        List<Node> secondNode = new ArrayList<>();
        secondNode.add(new Node(2, List.of()));
        secondNode.add(new Node(3, thirdNode));
        secondNode.add(new Node(4, List.of()));
        Node node = new Node(1, secondNode);
        LeetCode559 leetCode559 = new LeetCode559();
        int depth = leetCode559.maxDepth(node);
        System.out.println(depth);
    }

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        for (Node node : root.children) {
            int value = maxDepth(node);
            System.out.println(node.val + " " + value);
            if (value > max) {
                max = value;
            }
        }
        return max + 1;
    }
}
