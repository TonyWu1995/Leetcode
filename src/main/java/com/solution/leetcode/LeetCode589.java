package com.solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode589 {

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
        secondNode.add(new Node(3, thirdNode));
        secondNode.add(new Node(2, List.of()));
        secondNode.add(new Node(4, List.of()));
        Node node = new Node(1, secondNode);
        LeetCode589 leetCode589 = new LeetCode589();
        List<Integer> resultList = leetCode589.preorder(node);
        System.out.println(resultList);
    }

    List<Integer> resultList = new ArrayList<>();
    public List<Integer> preorder(Node root) {

        if (root == null) {
            return resultList;
        }
        resultList.add(root.val);
        for (Node child : root.children) {
            preorder(child);
        }
        return resultList;
    }
}
