package com.solution.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class LeetCode1161 {

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

    public int maxLevelSum(final TreeNode root) {
        int level = 1;
        int max = Integer.MIN_VALUE;
        int res = 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int sum = 0;
            for (int i = q.size(); i > 0; i--) {
                TreeNode node = q.poll();
                sum += node.val;
                if (node.left != null) {
                    q.offer(node.left) ;
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            if (sum > max) {
                max = sum;
                res = level;
            }
            level++;
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode leftNode1 = new TreeNode(7);
        TreeNode leftNode2 = new TreeNode(-8);
        TreeNode rNode = new TreeNode(0);
        TreeNode leftNode = new TreeNode(7, leftNode1, leftNode2);
        TreeNode root = new TreeNode(1, leftNode, rNode);

        LeetCode1161 leetCode1161 = new LeetCode1161();
        int sum = leetCode1161.maxLevelSum(root);
        System.out.println(sum);
    }

}
