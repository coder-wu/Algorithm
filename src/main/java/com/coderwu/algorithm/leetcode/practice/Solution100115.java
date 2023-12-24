package com.coderwu.algorithm.leetcode.practice;

public class Solution100115 {
    public int findChampion(int[][] grid) {
        int[] result = new int[grid.length];
        for (int[] ints : grid) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] == 1) {
                    result[j] = 1;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            if (result[i] == 0) {
                return i;
            }
        }
        return 0;
    }
}
