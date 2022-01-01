package com.solution.leetcode;

import java.util.ArrayList;
import java.util.List;



public class LeetCode1302 {

    public static void main(String[] args) {
//        root = [1,2,3,4,5,null,6,7,null,null,null,null,8] //15
//        root =[1,2,3] //5
        TreeNode rootNode = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        LeetCode1302 leetCode1302 = new LeetCode1302();
        System.out.println(leetCode1302.deepestLeavesSum(rootNode));
    }

    public int deepestLeavesSum(TreeNode root) {
        List<TreeNode> currentTreeNodeList = new ArrayList<>();
        currentTreeNodeList.add(root);
        int result = 0;
        while (!currentTreeNodeList.isEmpty()) {
            List<TreeNode> tempList = new ArrayList<>();
            for (TreeNode node : currentTreeNodeList) {
                if (null != node.left){
                    tempList.add(node.left);
                }
                if (null != node.right){
                    tempList.add(node.right);
                }
            }
            if (tempList.isEmpty()) {
                for (TreeNode node : currentTreeNodeList) {
                    result += node.val;
                }
            }
            currentTreeNodeList = tempList;
        }
        return result;
    }

}
