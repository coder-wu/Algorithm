package com.coderwu.algorithm.leetcode.contest.weekly._371;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/11/12
 **/
class Solution100117Test {

    @Test
    void minOperations() {
        Solution100117 solution = new Solution100117();
        assertEquals(1, solution.minOperations(new int[] {1, 2, 7}, new int[] {4, 5, 3}));
        assertEquals(2, solution.minOperations(new int[] {2, 3, 4, 5, 9}, new int[] {8, 8, 4, 4, 4}));
        assertEquals(-1, solution.minOperations(new int[] {1, 5, 4}, new int[] {2, 5, 3}));
    }
}