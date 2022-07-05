package com.solution.leetcode;

public class LeetCode404 {

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

    public int sumOfLeftLeaves(TreeNode root) {
        traversal(root, false);
        return sum;
    }

    int sum = 0;

    void traversal(TreeNode root, boolean isLeft) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (isLeft) {
                sum += root.val;
            }
        }
        traversal(root.right, false);
        traversal(root.left, true);
    }


    public static void main(String[] args) {
        TreeNode leftNode1 = new TreeNode(15);
        TreeNode leftNode2 = new TreeNode(7);
        TreeNode rNode = new TreeNode(20, leftNode1, leftNode2);
        TreeNode leftNode = new TreeNode(9);
        TreeNode root = new TreeNode(3, leftNode, rNode);
        LeetCode404 leetCode404 = new LeetCode404();

        int res = leetCode404.sumOfLeftLeaves(root);
        //return 24
        System.out.println(res);
    }

}
