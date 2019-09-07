package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode965 {


    //    A binary tree is univalued if every node in the tree has the same value.
//
//Return true if and only if the given tree is univalued.
//
//
    public static void main(String[] args) {

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


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
