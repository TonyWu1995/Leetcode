package com.solution.leetcode;

public class LeetCode101 {

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

    public boolean isMirror(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return a.val == b.val && isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }


    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left,root.right);
    }

    public static void main(String[] args) {
        TreeNode rightNode = new TreeNode(2, new TreeNode(4), new TreeNode(3));
        TreeNode leftNode = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        TreeNode root = new TreeNode(1, leftNode, rightNode);

        LeetCode101 leetCode101 = new LeetCode101();
        boolean res = leetCode101.isSymmetric(root);
        System.out.println(res);
    }

}
