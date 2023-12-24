package com.coderwu.algorithm.leetcode.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2206Test {

    @Test
    void divideArray() {
        Solution2206 solution = new Solution2206();
        int[] case1 = new int[] {3, 2, 3, 2, 2, 2};
        assertTrue(solution.divideArray(case1));

        int[] case2 = new int[] {1, 2, 3, 4};
        assertFalse(solution.divideArray(case2));
    }
}