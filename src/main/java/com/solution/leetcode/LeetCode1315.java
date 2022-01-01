package com.solution.leetcode;


public class LeetCode1315 {

    public static void main(String[] args) {
        TreeNode leftNode = new TreeNode(7, new TreeNode(2, null, null), new TreeNode(7, null, null));
        TreeNode rightNode = new TreeNode(8, new TreeNode(1, null, null), new TreeNode(3, null, null));

        TreeNode rootNode = new TreeNode(6, leftNode, rightNode);
        LeetCode1315 leetCode1315 = new LeetCode1315();
        System.out.println(leetCode1315.sumEvenGrandparent(rootNode));
    }

    //13
    public int sumEvenGrandparent(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int result = 0;
        if (root.val % 2 == 0) {
            result += sum(root, 0);
        }
        result += sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
        return result;
    }

    int sum(TreeNode root, int level) {
        if (root == null) {
            return 0;
        }
        if (level == 2) {
            return root.val;
        }
        return sum(root.left, level + 1) + sum(root.right, level + 1);
    }


}
