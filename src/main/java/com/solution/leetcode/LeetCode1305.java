package com.solution.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class LeetCode1305 {

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
        LeetCode1305 leetCode1305 = new LeetCode1305();
//        Input: root1 = [2,1,4], root2 = [1,0,3]
//Output: [0,1,1,2,3,4]
        TreeNode rootNode = new TreeNode(2);
        rootNode.left = new TreeNode(1);
        rootNode.right = new TreeNode(4);
        TreeNode rootNode2 = new TreeNode(1);
        rootNode2.left = new TreeNode(0);
        rootNode2.right = new TreeNode(3);
        System.out.println(leetCode1305.getAllElements(rootNode, rootNode2));
    }

    List<Integer> list;
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        list = new ArrayList<>();
        if(root1!=null) inorder(root1);
        if(root2!=null) inorder(root2);
        Collections.sort(list);
        return list;
    }
    public void inorder(TreeNode root){
        if(root.left!=null) inorder(root.left);
        list.add(root.val);
        if(root.right!=null) inorder(root.right);
    }

}
