package com.coderwu.algorithm.leetcode.contest.weekly._372;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/11/19
 **/
class Solution100131Test {

    @Test
    void findMinimumOperations() {
        Solution100131 solution= new Solution100131();
        assertEquals(2, solution.findMinimumOperations("abc", "abb", "ab"));
        assertEquals(-1, solution.findMinimumOperations("dac", "bac", "cac"));
        assertEquals(0, solution.findMinimumOperations("a", "a", "a"));
    }
}