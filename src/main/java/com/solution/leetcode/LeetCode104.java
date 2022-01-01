package com.solution.leetcode;

//Given the root of a binary tree, return its maximum depth.
//
//A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
//
//
//
//Example 1:
//
//
//Input: root = [3,9,20,null,null,15,7]
//Output: 3
//Example 2:
//
//Input: root = [1,null,2]
//Output: 2
//Example 3:
//
//Input: root = []
//Output: 0
//Example 4:
//
//Input: root = [0]
//Output: 1
public class LeetCode104 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        LeetCode104 leetCode104 = new LeetCode104();
        TreeNode node1 = new TreeNode(15);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(20, node1, node2);
        TreeNode node4 = new TreeNode(9);
        TreeNode node5 = new TreeNode(3, node4, node3);
        System.out.println(leetCode104.maxDepth(node5));
    }


    static class TreeNode {
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

}
