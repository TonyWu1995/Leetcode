package com.solution.leetcode;

import java.util.*;

public class LeetCode1261 {

    static class TreeNode {
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

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(-1, null, new TreeNode(-1));

        FindElements findElements = new FindElements(treeNode);
        boolean b = findElements.find(1);
        System.out.println(b);
        boolean b1 = findElements.find(2);
        System.out.println(b1);

    }

    static class FindElements {

        Set<Integer> result;
        public FindElements(TreeNode root) {
            result= new HashSet<>();
            if (root == null) {
                return;
            }
            Queue<TreeNode> q = new LinkedList<>();
            root.val = 0;
            q.offer(root);
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode n = q.poll();
                    result.add(n.val);
                    if (n.left != null) {
                        n.left.val = 2 * n.val + 1;
                        q.offer(n.left);
                        result.add(n.left.val);
                    }
                    if (n.right != null) {
                        n.right.val = 2 * n.val + 2;
                        q.offer(n.right);
                        result.add(n.right.val);
                    }
                }
            }
        }

        public boolean find(int target) {
            return this.result.contains(target);
        }
    }

}
