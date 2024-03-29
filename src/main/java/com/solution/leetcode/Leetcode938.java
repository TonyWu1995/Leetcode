package com.solution.leetcode;

public class Leetcode938 {

//    Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
//
//    The binary search tree is guaranteed to have unique values.
//
//
//
//    Example 1:
//
//    Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
//    Output: 32
//    Example 2:
//
//    Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
//    Output: 23

    public static void main(String[] args) {
        Leetcode938 leetcode938 = new Leetcode938();

    }

    int result = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return result;
        }
        if (root.val >= L && root.val <= R) {
            result += root.val;
        }
        rangeSumBST(root.left, L, R);
        rangeSumBST(root.right, L, R);
        return result;
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


