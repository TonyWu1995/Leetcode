package com.solution.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode199 {

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

    //bfs
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<Integer> result = new ArrayList<>();
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode n = q.poll();
                list.add(n.val);
                if (n.left != null) {
                    q.offer(n.left);
                }
                if (n.right != null) {
                    q.offer(n.right);
                }
            }

            result.add(list.get(list.size() - 1));
        }
        return result;
    }

    //dfs
    public List<Integer> rightSideView1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        rightSide(root, res, 0);
        return res;
    }

    public void rightSide(TreeNode root, List<Integer> res, int level) {
        if (root == null) return;
        if (res.size() == level) {
            res.add(root.val);
        }
        rightSide(root.right, res, level + 1);
        rightSide(root.left, res, level + 1);
    }

    public static void main(String[] args) {
        TreeNode leftNode2 = new TreeNode(4);
        TreeNode rNode = new TreeNode(3, null, leftNode2);
        TreeNode leftNode = new TreeNode(2, null, null);
        TreeNode root = new TreeNode(1, leftNode, rNode);

        LeetCode199 leetCode199 = new LeetCode199();

//        leetCode199.rightSideView(root);
        System.out.println(leetCode199.rightSideView(root));
//        System.out.println(leetCode199.rightSideView(root));
    }

}
