package com.coderwu.algorithm.leetcode.practice;

import java.util.Arrays;

/**
 * @author : coderWu
 * @since : 2023/12/10
 **/
public class Solution931 {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        System.arraycopy(matrix[0], 0, dp[0], 0, n);

        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n; i++) {
                boolean hasLeft = i - 1 >= 0;
                boolean hasRight = i + 1 < n;
                int minFrom = dp[j - 1][i];
                if (hasLeft) {
                    minFrom = Math.min(minFrom, dp[j - 1][i - 1]);
                }
                if (hasRight) {
                    minFrom = Math.min(minFrom, dp[j - 1][i + 1]);
                }
                dp[j][i] = matrix[j][i] + minFrom;
            }
        }

        Arrays.sort(dp[n - 1]);
        return dp[n - 1][0];
    }
}
