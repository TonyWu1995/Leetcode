package com.company.leetcode;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode965 {


    //    A binary tree is univalued if every node in the tree has the same value.
//
//Return true if and only if the given tree is univalued.
//
//
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.right.left = null;
        root.right.right = new TreeNode(1);
        LeetCode965 leetCode965 = new LeetCode965();
        final boolean result = leetCode965.isUnivalTree(root);
        System.out.println(result);
    }

    List<Integer> valueList;

    public boolean isUnivalTree(TreeNode root) {
        valueList = new ArrayList();
        dfs(root);
        for (int i : valueList) {
            if (root.val != i)
                return false;
        }
        return true;
    }

    public void dfs(TreeNode node) {
        if (node != null) {
            valueList.add(node.val);
            dfs(node.left);
            dfs(node.right);
        }
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
