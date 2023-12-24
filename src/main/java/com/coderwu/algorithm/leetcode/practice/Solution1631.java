package com.coderwu.algorithm.leetcode.practice;

import java.util.Arrays;

/**
 * @author : coderWu
 * @since : 2023/12/11
 **/
public class Solution1631 {
    public int minimumEffortPath(int[][] heights) {
        int row = heights.length;
        int column = heights[0].length;

        int rowIndex = 0;
        int columnIndex = 0;

        boolean[][] visit = new boolean[row][column];

        int left = 0;
        int right = Arrays.stream(heights).flatMapToInt(Arrays::stream).max().orElse(0);
        while (left < right) {
            int mid = (left + right) / 2;
            boolean hasPath = minPath(heights, visit, rowIndex, columnIndex, heights[0][0], mid);
            if (hasPath) {
                if (mid == right) {
                    return right;
                }
                right = mid;
            } else {
                if (left == mid) {
                    return right;
                }
                left = mid;
            }
        }

        return right;
    }

    private boolean minPath(int[][] heights, boolean[][] visit, int rowIndex, int columnIndex, int lastValue, int diff) {
        if (rowIndex == heights.length - 1 && columnIndex == heights[0].length - 1) {
            return Math.abs(heights[rowIndex][columnIndex] - lastValue) <= diff;
        }

        boolean hasPath = false;
        boolean upVisitable = rowIndex - 1 >= 0 &&
                !visit[rowIndex - 1][columnIndex] &&
                Math.abs(heights[rowIndex - 1][columnIndex] - heights[rowIndex][columnIndex]) <= diff;
        if (upVisitable) {
            visit[rowIndex][columnIndex] = true;
            hasPath = minPath(heights, visit, rowIndex - 1, columnIndex, heights[rowIndex][columnIndex], diff);
            visit[rowIndex][columnIndex] = false;
        }


        boolean downVisitable = rowIndex + 1 < heights.length &&
                !visit[rowIndex + 1][columnIndex] &&
                Math.abs(heights[rowIndex + 1][columnIndex] - heights[rowIndex][columnIndex]) <= diff;
        if (downVisitable && !hasPath) {
            visit[rowIndex][columnIndex] = true;
            hasPath = minPath(heights, visit, rowIndex + 1, columnIndex, heights[rowIndex][columnIndex], diff);
            visit[rowIndex][columnIndex] = false;
        }


        boolean leftVisitable = columnIndex - 1 >= 0 &&
                !visit[rowIndex][columnIndex - 1] &&
                Math.abs(heights[rowIndex][columnIndex - 1] - heights[rowIndex][columnIndex]) <= diff;
        if (leftVisitable && !hasPath) {
            visit[rowIndex][columnIndex] = true;
            hasPath = minPath(heights, visit, rowIndex, columnIndex - 1, heights[rowIndex][columnIndex], diff);
            visit[rowIndex][columnIndex] = false;
        }


        boolean rightVisitable = columnIndex + 1 < heights[0].length &&
                !visit[rowIndex][columnIndex + 1] &&
                Math.abs(heights[rowIndex][columnIndex + 1] - heights[rowIndex][columnIndex]) <= diff;
        if (rightVisitable && !hasPath) {
            visit[rowIndex][columnIndex] = true;
            hasPath = minPath(heights, visit, rowIndex, columnIndex + 1, heights[rowIndex][columnIndex], diff);
            visit[rowIndex][columnIndex] = false;
        }

        return hasPath;
    }
}
