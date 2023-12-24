package com.coderwu.algorithm.leetcode.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/12/3
 **/
class Solution746Test {
    private Solution746 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution746();
    }

    @Test
    void minCostClimbingStairs() {
        assertEquals(15, solution.minCostClimbingStairs(new int[] {10, 15, 20}));
        assertEquals(6, solution.minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100 ,1}));
    }
}