package com.solution.leetcode;

public class LeetCode200 {

    public int numIslands(char[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    void dfs(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        if (j - 1 != -1 && grid[i][j - 1] == '1') {
            dfs(grid, i, j - 1);
        }
        if (j + 1 != grid[0].length && grid[i][j + 1] == '1') {
            dfs(grid, i, j + 1);
        }
        if (i - 1 != -1 && grid[i - 1][j] == '1') {
            dfs(grid, i - 1, j);
        }
        if (i + 1 != grid.length && grid[i + 1][j] == '1') {
            dfs(grid, i + 1, j);
        }
    }


    public static void main(String[] args) {
        LeetCode200 leetCode200 = new LeetCode200();
        int res = leetCode200.numIslands(new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        });
        System.out.println(res); //1
    }

}
