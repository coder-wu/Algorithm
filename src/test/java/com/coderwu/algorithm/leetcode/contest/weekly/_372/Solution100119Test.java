package com.coderwu.algorithm.leetcode.contest.weekly._372;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/11/19
 **/
class Solution100119Test {
    Solution100119 solution = new Solution100119();

    @Test
    void maximumXorProduct() {
        assertEquals(98, solution.maximumXorProduct(12L, 5L, 4));
        assertEquals(930, solution.maximumXorProduct(6L, 7L, 5));
        assertEquals(12, solution.maximumXorProduct(1L, 6L, 3));
    }
}