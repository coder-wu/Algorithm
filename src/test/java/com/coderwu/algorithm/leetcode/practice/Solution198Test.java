package com.coderwu.algorithm.leetcode.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/12/3
 **/
class Solution198Test {
    Solution198 solution = new Solution198();

    @Test
    void rob() {
        assertEquals(4, solution.rob(new int[]{1, 2, 3, 1}));
        assertEquals(4, solution.rob(new int[]{2, 1, 1, 2}));
        assertEquals(12, solution.rob(new int[]{2, 7, 9, 3, 1}));
    }
}