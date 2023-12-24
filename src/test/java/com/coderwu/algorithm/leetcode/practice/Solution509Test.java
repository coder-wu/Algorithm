package com.coderwu.algorithm.leetcode.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/12/2
 **/
class Solution509Test {
    private final Solution509 solution = new Solution509();

    @Test
    void fib() {
        assertEquals(1, solution.fib(2));
        assertEquals(2, solution.fib(3));
        assertEquals(3, solution.fib(4));
    }
}