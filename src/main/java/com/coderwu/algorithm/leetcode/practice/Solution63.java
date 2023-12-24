package com.coderwu.algorithm.leetcode.practice;

/**
 * @author : coderWu
 * @since : 2023/12/9
 **/
public class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }
                if (j == 0 && i == 0) {
                    continue;
                }

                int left = j - 1 >= 0 ? dp[i][j - 1] : 0;
                int top = i - 1 >= 0 ? dp[i - 1][j] : 0;
                dp[i][j] = left + top;
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
