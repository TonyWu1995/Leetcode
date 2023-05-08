package com.solution.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode637 {

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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> res = new ArrayList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                sum += node.val;
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            res.add(sum / size);
        }
        return res;
    }




    public static void main(String[] args) {
//        [3,9,20,null,null,15,7]
        TreeNode rightNode = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode leftNode = new TreeNode(9);
        TreeNode root = new TreeNode(3, leftNode, rightNode);

        LeetCode637 leetCode637 = new LeetCode637();
        List<Double> list = leetCode637.averageOfLevels(root);
        System.out.println(list);
    }

}
