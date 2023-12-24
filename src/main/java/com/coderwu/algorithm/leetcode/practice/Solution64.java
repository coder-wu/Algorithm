package com.coderwu.algorithm.leetcode.practice;

/**
 * @author : coderWu
 * @since : 2023/12/8
 **/
public class Solution64 {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                    continue;
                }
                int left = j - 1 >= 0 ? dp[i][j - 1] : Integer.MAX_VALUE;
                int top = i - 1 >= 0 ? dp[i - 1][j] : Integer.MAX_VALUE;
                dp[i][j] = Math.min(left, top) + grid[i][j];
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
