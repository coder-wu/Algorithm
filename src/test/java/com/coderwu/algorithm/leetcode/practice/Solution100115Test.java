package com.coderwu.algorithm.leetcode.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution100115Test {

    @Test
    void findChampion() {
        Solution100115 solution = new Solution100115();
        int[][] case1 = new int[][] {
                {0, 1},
                {0, 0},
        };
        assertEquals(0, solution.findChampion(case1));

        int[][] case2 = new int[][] {
                {0, 0, 1},
                {1, 0, 1},
                {0, 0, 0}
        };
        assertEquals(1, solution.findChampion(case2));
    }
}