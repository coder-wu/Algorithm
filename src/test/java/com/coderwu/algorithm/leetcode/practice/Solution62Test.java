package com.coderwu.algorithm.leetcode.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/12/8
 **/
class Solution62Test {
    private final Solution62 solution = new Solution62();

    @Test
    void uniquePaths() {
        assertEquals(28, solution.uniquePaths(3, 7));
        assertEquals(3, solution.uniquePaths(3, 2));
        assertEquals(28, solution.uniquePaths(7, 3));
        assertEquals(6, solution.uniquePaths(3, 3));
    }
}