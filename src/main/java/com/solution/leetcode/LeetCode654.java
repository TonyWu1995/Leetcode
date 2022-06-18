package com.solution.leetcode;

public class LeetCode654 {

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

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public static void main(String[] args) {
        LeetCode654 leetCode654 = new LeetCode654();
        TreeNode treeNode = leetCode654.constructMaximumBinaryTree(new int[]{
                3, 2, 1
        });
        System.out.println(treeNode.toString());
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int idxMax = start;
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] > nums[idxMax]) {
                idxMax = i;
            }
        }
        TreeNode root = new TreeNode(nums[idxMax]);
        root.left = build(nums, start, idxMax - 1);
        root.right = build(nums, idxMax + 1, end);
        return root;
    }

}
