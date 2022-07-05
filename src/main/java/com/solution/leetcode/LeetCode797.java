package com.solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode797 {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> pathList = new ArrayList<>();
        pathList.add(0);
        dfs(graph, 0, res, pathList);
        return res;
    }

    void dfs(int[][] graph, int startNode, List<List<Integer>> res, List<Integer> pathList) {
        if (startNode == graph.length - 1) {
            res.add(new ArrayList<>(pathList));
            return;
        }
        for (int n : graph[startNode]) {
            pathList.add(n);
            dfs(graph, n, res, pathList);
            pathList.remove(pathList.size() - 1);
        }
    }


    public static void main(String[] args) {
        int[][] input = new int[][]{
                {1, 2},
                {3},
                {3},
                {}
        };

        LeetCode797 leetCode797 = new LeetCode797();
        List<List<Integer>> list = leetCode797.allPathsSourceTarget(input);
        System.out.println(list);
    }

}
