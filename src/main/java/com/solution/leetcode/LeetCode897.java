package com.solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode897 {

    public static void main(String[] args) {
        LeetCode897 leetCode897 = new LeetCode897();
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(6);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.left = null;
        treeNode.right.right = new TreeNode(8);
        treeNode.left.left.left = new TreeNode(1);
        treeNode.left.left.right = null;
        treeNode.left.right.left = null;
        treeNode.left.right.right = null;
        treeNode.right.right.left = new TreeNode(7);
        treeNode.right.right.right = new TreeNode(9);
        final TreeNode node = leetCode897.increasingBST(treeNode);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    List<Integer> valueList = new ArrayList<>();

    public TreeNode increasingBST(TreeNode root) {
        inOrder(root);
        TreeNode ans = new TreeNode(0);
        TreeNode cur = ans;
        for (int v : valueList) {
            cur.right = new TreeNode(v);
            cur = cur.right;
        }
        return ans.right;
    }

    public void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        valueList.add(node.val);
        inOrder(node.right);
    }
}
