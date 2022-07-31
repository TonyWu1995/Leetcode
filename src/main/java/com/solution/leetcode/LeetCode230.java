package com.solution.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class LeetCode230 {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int kthSmallest1(TreeNode root, int k) {
        List<Integer> res = new ArrayList<>();
        traversal(root, res);
        Collections.sort(res);
        return res.get(k - 1);
    }

    void traversal(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        res.add(node.val);
        traversal(node.left, res);
        traversal(node.right, res);
    }

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (--k == 0) {
                return root.val;
            }
            root = root.right;
        }
    }

    public static void main(String[] args) {
        TreeNode rightNode = new TreeNode(4);
        TreeNode leftNode = new TreeNode(1, null, new TreeNode(2));
        TreeNode root = new TreeNode(3, leftNode, rightNode);
        LeetCode230 leetCode230 = new LeetCode230();
        int smallest = leetCode230.kthSmallest(root, 1);
        System.out.println(smallest);
    }

}
