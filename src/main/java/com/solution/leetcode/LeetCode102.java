package com.solution.leetcode;

import java.util.*;

public class LeetCode102 {

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            List<Integer> tempList = new LinkedList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode n = q.poll();
                if (n.left != null) {
                    q.offer(n.left);
                }
                if (n.right != null) {
                    q.offer(n.right);
                }
                tempList.add(n.val);
            }
            result.add(tempList);
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode leftNode1 = new TreeNode(15);
        TreeNode leftNode2 = new TreeNode(7);
        TreeNode rNode = new TreeNode(20, leftNode1, leftNode2);
        TreeNode leftNode = new TreeNode(9);
        TreeNode root = new TreeNode(3, leftNode, rNode);
        LeetCode102 leetCode102 = new LeetCode102();
        System.out.println(leetCode102.levelOrder(root));
    }

}
