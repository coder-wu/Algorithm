package com.coderwu.algorithm.leetcode.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution100116Test {

    @Test
    void findChampion() {
        Solution100116 solution = new Solution100116();
        int[][] case1 = new int[][] {
                {0, 1},
                {1, 2}
        };
        assertEquals(0, solution.findChampion(3, case1));

        int[][] case2 = new int[][] {
                {0, 2},
                {1, 2},
                {1, 3}
        };
        assertEquals(-1, solution.findChampion(4, case2));
    }
}