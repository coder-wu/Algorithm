package com.coderwu.algorithm.leetcode.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/12/3
 **/
class Solution1137Test {
    private Solution1137 solution = new Solution1137();

    @Test
    void tribonacci() {
        assertEquals(4, solution.tribonacci(4));
        assertEquals(1389537, solution.tribonacci(25));
    }
}