package com.solution.leetcode;

public class LeetCode1299 {

    public int countNegatives(int[][] grid) {
        int count = 0;
        int rowLen = grid.length;
        int colLen = grid[0].length;
        for (int i = rowLen - 1; i >= 0; i--) {
            if (grid[i][0] < 0) {
                count += colLen;
                continue;
            }
            if (grid[i][colLen - 1] >= 0) {
                continue;
            }

            int l = 1;
            int u = colLen - 1;
            while (l <= u) {
                int mid = (u - l) / 2 + l;
                if (grid[i][mid - 1] >= 0 && grid[i][mid] < 0) {
                    count += colLen - mid;
                    break;
                }
                if (grid[i][mid] < 0) {
                    u = mid;
                } else {
                    l = mid + 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LeetCode1299 leetCode1299 = new LeetCode1299();
        int res = leetCode1299.countNegatives(new int[][]
                {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}});
        System.out.println(res);
    }

}
