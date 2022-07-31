package com.solution.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode112 {

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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solution(root, targetSum);
    }

    public boolean solution(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        //leaf
        if (root.left == null && root.right == null) {
            return targetSum - root.val == 0;
        }
        return solution(root.left, targetSum - root.val) || solution(root.right, targetSum - root.val);
    }

    public static void main(String[] args) {
        TreeNode leftNode5 = new TreeNode(7, null, null);
        TreeNode leftNode6 = new TreeNode(2, null, null);
        TreeNode leftNode4 = new TreeNode(11, leftNode5, leftNode6);
        TreeNode leftNode3 = new TreeNode(1);
        TreeNode leftNode1 = new TreeNode(13);
        TreeNode leftNode2 = new TreeNode(4, null, leftNode3);
        TreeNode rNode = new TreeNode(8, leftNode1, leftNode2);
        TreeNode leftNode = new TreeNode(4, leftNode4, null);
        TreeNode root = new TreeNode(5, leftNode, rNode);
        LeetCode112 leetCode112 = new LeetCode112();
        System.out.println(leetCode112.hasPathSum(root, 22));
    }

}
