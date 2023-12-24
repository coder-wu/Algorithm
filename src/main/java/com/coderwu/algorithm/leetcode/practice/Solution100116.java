package com.coderwu.algorithm.leetcode.practice;

public class Solution100116 {
    public int findChampion(int n, int[][] edges) {
        int[] result = new int[n];
        int[][] grid = new int[n][n];

        for (int[] edge : edges) {
            grid[edge[0]][edge[1]] = 1;
        }

        for (int[] ints : grid) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] == 1) {
                    result[j] = 1;
                }
            }
        }

        int team = -1;
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            if (result[i] == 0) {
                team = i;
                sum++;
            }
        }

        if (sum != 1) {
            team = -1;
        }
        return team;
    }
}
