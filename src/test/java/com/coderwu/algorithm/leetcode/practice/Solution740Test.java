package com.coderwu.algorithm.leetcode.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/12/3
 **/
class Solution740Test {
    private final Solution740 solution = new Solution740();

    @Test
    void deleteAndEarn() {
        assertEquals(6, solution.deleteAndEarn(new int[]{3, 4, 2}));
        assertEquals(9, solution.deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
        assertEquals(18, solution.deleteAndEarn(new int[]{1, 1, 1, 2, 4, 5, 5, 5, 6}));
    }
}