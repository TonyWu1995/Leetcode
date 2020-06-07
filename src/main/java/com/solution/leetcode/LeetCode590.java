package com.solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode590 {


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
        LeetCode590 leetCode590 = new LeetCode590();
        List<Integer> resultList = leetCode590.postorder(node);
        System.out.println(resultList);
    }

    List<Integer> resultList = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root == null) {
            return resultList;
        }
        for (Node node : root.children) {
            postorder(node);
        }
        resultList.add(root.val);
        return resultList;
    }
}
