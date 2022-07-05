package com.solution.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode111 {

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

        public String toString() {
            return this.val + "";
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            level++;
            for (int i = 0; i < size; i++) {
                TreeNode n = q.poll();
                if (n.left == null && n.right == null) {
                    return level;
                }
                if (n.left != null) {
                    q.offer(n.left);
                }
                if (n.right != null) {
                    q.offer(n.right);
                }
            }
        }
        return level;
    }


    public static void main(String[] args) {
        TreeNode leftNode1 = new TreeNode(15);
        TreeNode leftNode2 = new TreeNode(7);
        TreeNode rNode = new TreeNode(20, leftNode1, leftNode2);
        TreeNode leftNode = new TreeNode(9);
        TreeNode root = new TreeNode(3, leftNode, rNode);
        LeetCode111 leetCode111 = new LeetCode111();
        System.out.println(leetCode111.minDepth(root));
    }

}
