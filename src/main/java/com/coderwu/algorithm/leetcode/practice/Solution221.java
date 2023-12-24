package com.coderwu.algorithm.leetcode.practice;

/**
 * @author : coderWu
 * @since : 2023/12/10
 **/
public class Solution221 {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];

        int maxArea = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    int row = j - 1 >= 0 ? dp[i][j - 1] >> 15 : 0;
                    int column = i - 1 >= 0 ? dp[i - 1][j] - (dp[i - 1][j] >> 15 << 15) : 0;
                    row++;
                    column++;

                    dp[i][j] = (row << 15) + column;

                    maxArea = 1;
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0 && j > 0 && dp[i - 1][j - 1] > 0 && dp[i][j] > 0) {
                    int row = dp[i][j] >> 15;
                    int column = dp[i][j] - (row << 15);

                    int lastLength = (int) Math.sqrt(dp[i - 1][j - 1]);
                    int minLength = Math.min(lastLength + 1, row);
                    minLength = Math.min(minLength, column);
                    dp[i][j] = minLength * minLength;
                    maxArea = Math.max(maxArea, dp[i][j]);
                    continue;
                }
                dp[i][j] = dp[i][j] > 0 ? 1 : 0;
            }
        }
        return maxArea;
    }
}
